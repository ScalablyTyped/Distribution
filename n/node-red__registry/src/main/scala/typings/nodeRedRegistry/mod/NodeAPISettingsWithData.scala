package typings.nodeRedRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify LocalSettings * / any */ @js.native
trait NodeAPISettingsWithData extends NodeAPISettings
object NodeAPISettingsWithData {
  
  @scala.inline
  def apply(
    available: () => Boolean,
    delete: String => js.Promise[Unit],
    disableNodeSettings: js.Array[String] => Unit,
    enableNodeSettings: js.Array[String] => Unit,
    exportNodeSettings: js.Object => js.Object,
    get: String => js.Any,
    getUserSettings: String => Unit,
    registerNodeSettings: (String, js.Object) => Unit,
    set: (String, js.Any) => js.Promise[Unit],
    setUserSettings: (String, js.Object) => js.Promise[Unit]
  ): NodeAPISettingsWithData = {
    val __obj = js.Dynamic.literal(available = js.Any.fromFunction0(available), delete = js.Any.fromFunction1(delete), disableNodeSettings = js.Any.fromFunction1(disableNodeSettings), enableNodeSettings = js.Any.fromFunction1(enableNodeSettings), exportNodeSettings = js.Any.fromFunction1(exportNodeSettings), get = js.Any.fromFunction1(get), getUserSettings = js.Any.fromFunction1(getUserSettings), registerNodeSettings = js.Any.fromFunction2(registerNodeSettings), set = js.Any.fromFunction2(set), setUserSettings = js.Any.fromFunction2(setUserSettings))
    __obj.asInstanceOf[NodeAPISettingsWithData]
  }
}
