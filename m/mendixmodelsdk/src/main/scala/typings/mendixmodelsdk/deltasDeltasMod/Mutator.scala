package typings.mendixmodelsdk.deltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator
  - typings.mendixmodelsdk.deltasDeltasMod.IAddMutator
  - typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator
*/
trait Mutator extends StObject
object Mutator {
  
  @scala.inline
  def IAddMutator(value: PrimitiveValue): typings.mendixmodelsdk.deltasDeltasMod.IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "ADD", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IAddMutator]
  }
  
  @scala.inline
  def IChangeMutator(): typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "CHANGE", value = null)
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IChangeMutator]
  }
  
  @scala.inline
  def IRemoveMutator(removalIndex: Double): typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "REMOVE", removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.deltasDeltasMod.IRemoveMutator]
  }
}
