package typings.mendixmodelsdk.deltasDeltasMod

import typings.mendixmodelsdk.mendixmodelsdkStrings.ADD
import typings.mendixmodelsdk.mendixmodelsdkStrings.CHANGE
import typings.mendixmodelsdk.mendixmodelsdkStrings.REMOVE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator
  - typings.mendixmodelsdk.deltasDeltasMod.IAddMutator
  - typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator
*/
trait Mutator extends StObject
object Mutator {
  
  @scala.inline
  def IAddMutator(mutatorType: ADD, value: PrimitiveValue): typings.mendixmodelsdk.deltasDeltasMod.IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IAddMutator]
  }
  
  @scala.inline
  def IChangeMutator(mutatorType: CHANGE): typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator]
  }
  
  @scala.inline
  def IRemoveMutator(mutatorType: REMOVE, removalIndex: Double): typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = mutatorType.asInstanceOf[js.Any], removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator]
  }
}
