package typings.next.mod

import typings.next.anon.Locale
import typings.next.nextStrings.blocking
import typings.node.querystringMod.ParsedUrlQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetStaticPathsResult[P /* <: ParsedUrlQuery */] extends js.Object {
  
  var fallback: Boolean | blocking = js.native
  
  var paths: js.Array[String | Locale[P]] = js.native
}
object GetStaticPathsResult {
  
  @scala.inline
  def apply[P /* <: ParsedUrlQuery */](fallback: Boolean | blocking, paths: js.Array[String | Locale[P]]): GetStaticPathsResult[P] = {
    val __obj = js.Dynamic.literal(fallback = fallback.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStaticPathsResult[P]]
  }
  
  @scala.inline
  implicit class GetStaticPathsResultOps[Self <: GetStaticPathsResult[_], P /* <: ParsedUrlQuery */] (val x: Self with GetStaticPathsResult[P]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFallback(value: Boolean | blocking): Self = this.set("fallback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathsVarargs(value: (String | Locale[P])*): Self = this.set("paths", js.Array(value :_*))
    
    @scala.inline
    def setPaths(value: js.Array[String | Locale[P]]): Self = this.set("paths", value.asInstanceOf[js.Any])
  }
}
