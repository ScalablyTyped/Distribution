package typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator
  - typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator
  - typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator
*/
trait Mutator extends StObject
object Mutator {
  
  inline def IAddMutator(value: PrimitiveValue): typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "ADD", value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IAddMutator]
  }
  
  inline def IChangeMutator(): typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "CHANGE", value = null)
    __obj.asInstanceOf[typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IChangeMutator]
  }
  
  inline def IRemoveMutator(removalIndex: Double): typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator = {
    val __obj = js.Dynamic.literal(mutatorType = "REMOVE", removalIndex = removalIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.mendixmodelsdk.srcSdkInternalDeltasDeltasMod.IRemoveMutator]
  }
}
