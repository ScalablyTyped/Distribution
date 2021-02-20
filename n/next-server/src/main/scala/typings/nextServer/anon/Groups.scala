package typings.nextServer.anon

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Groups extends StObject {
  
  var groups: StringDictionary[Double] = js.native
  
  var re: RegExp = js.native
}
object Groups {
  
  @scala.inline
  def apply(groups: StringDictionary[Double], re: RegExp): Groups = {
    val __obj = js.Dynamic.literal(groups = groups.asInstanceOf[js.Any], re = re.asInstanceOf[js.Any])
    __obj.asInstanceOf[Groups]
  }
  
  @scala.inline
  implicit class GroupsMutableBuilder[Self <: Groups] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroups(value: StringDictionary[Double]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRe(value: RegExp): Self = StObject.set(x, "re", value.asInstanceOf[js.Any])
  }
}
