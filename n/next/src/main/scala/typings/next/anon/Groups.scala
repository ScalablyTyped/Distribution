package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.routeRegexMod.Group
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends js.Object {
  
  var groups: StringDictionary[Group] = js.native
  
  var namedRegex: js.UndefOr[String] = js.native
  
  var re: RegExp = js.native
  
  var routeKeys: js.UndefOr[StringDictionary[String]] = js.native
}
object Groups {
  
  @scala.inline
  def apply(groups: StringDictionary[Group], re: RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsOps[Self <: Groups] (val x: Self) extends AnyVal {
    
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
    def setGroups(value: StringDictionary[Group]): Self = this.set("groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRe(value: RegExp): Self = this.set("re", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRegex(value: String): Self = this.set("namedRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamedRegex: Self = this.set("namedRegex", js.undefined)
    
    @scala.inline
    def setRouteKeys(value: StringDictionary[String]): Self = this.set("routeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteKeys: Self = this.set("routeKeys", js.undefined)
  }
}
