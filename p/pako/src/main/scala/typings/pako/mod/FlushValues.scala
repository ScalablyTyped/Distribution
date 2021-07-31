package typings.pako.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FlushValues extends StObject
@JSImport("pako", "FlushValues")
@js.native
object FlushValues extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FlushValues & Double] = js.native
  
  @js.native
  sealed trait Z_BLOCK
    extends StObject
       with FlushValues
  /* 5 */ val Z_BLOCK: typings.pako.mod.FlushValues.Z_BLOCK & Double = js.native
  
  @js.native
  sealed trait Z_FINISH
    extends StObject
       with FlushValues
  /* 4 */ val Z_FINISH: typings.pako.mod.FlushValues.Z_FINISH & Double = js.native
  
  @js.native
  sealed trait Z_FULL_FLUSH
    extends StObject
       with FlushValues
  /* 3 */ val Z_FULL_FLUSH: typings.pako.mod.FlushValues.Z_FULL_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_NO_FLUSH
    extends StObject
       with FlushValues
  /* 0 */ val Z_NO_FLUSH: typings.pako.mod.FlushValues.Z_NO_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_PARTIAL_FLUSH
    extends StObject
       with FlushValues
  /* 1 */ val Z_PARTIAL_FLUSH: typings.pako.mod.FlushValues.Z_PARTIAL_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_SYNC_FLUSH
    extends StObject
       with FlushValues
  /* 2 */ val Z_SYNC_FLUSH: typings.pako.mod.FlushValues.Z_SYNC_FLUSH & Double = js.native
  
  @js.native
  sealed trait Z_TREES
    extends StObject
       with FlushValues
  /* 6 */ val Z_TREES: typings.pako.mod.FlushValues.Z_TREES & Double = js.native
}
