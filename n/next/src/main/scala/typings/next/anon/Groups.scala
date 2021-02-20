package typings.next.anon

import org.scalablytyped.runtime.StringDictionary
import typings.next.routeRegexMod.Group
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends StObject {
  
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
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: StringDictionary[Group]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRegex(value: String): Self = StObject.set(x, "namedRegex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamedRegexUndefined: Self = StObject.set(x, "namedRegex", js.undefined)
    
    @scala.inline
    def setRe(value: RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKeys(value: StringDictionary[String]): Self = StObject.set(x, "routeKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteKeysUndefined: Self = StObject.set(x, "routeKeys", js.undefined)
  }
}
