package typings.next.buildMod

import org.scalablytyped.runtime.StringDictionary
import typings.next.apiUtilsMod.ApiPreviewProps
import typings.next.nextNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PrerenderManifest extends js.Object {
  
  var dynamicRoutes: StringDictionary[DynamicSsgRoute] = js.native
  
  var notFoundRoutes: js.Array[String] = js.native
  
  var preview: ApiPreviewProps = js.native
  
  var routes: StringDictionary[SsgRoute] = js.native
  
  var version: `2` = js.native
}
object PrerenderManifest {
  
  @scala.inline
  def apply(
    dynamicRoutes: StringDictionary[DynamicSsgRoute],
    notFoundRoutes: js.Array[String],
    preview: ApiPreviewProps,
    routes: StringDictionary[SsgRoute],
    version: `2`
  ): PrerenderManifest = {
    val __obj = js.Dynamic.literal(dynamicRoutes = dynamicRoutes.asInstanceOf[js.Any], notFoundRoutes = notFoundRoutes.asInstanceOf[js.Any], preview = preview.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrerenderManifest]
  }
  
  @scala.inline
  implicit class PrerenderManifestOps[Self <: PrerenderManifest] (val x: Self) extends AnyVal {
    
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
    def setDynamicRoutes(value: StringDictionary[DynamicSsgRoute]): Self = this.set("dynamicRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotFoundRoutesVarargs(value: String*): Self = this.set("notFoundRoutes", js.Array(value :_*))
    
    @scala.inline
    def setNotFoundRoutes(value: js.Array[String]): Self = this.set("notFoundRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreview(value: ApiPreviewProps): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutes(value: StringDictionary[SsgRoute]): Self = this.set("routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: `2`): Self = this.set("version", value.asInstanceOf[js.Any])
  }
}
