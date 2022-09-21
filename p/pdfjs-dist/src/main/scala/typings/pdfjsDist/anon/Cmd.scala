package typings.pdfjsDist.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cmd extends StObject {
  
  var cmd: js.Function
  
  var keepUndo: Boolean
  
  var mustExec: Boolean
  
  var overwriteIfSameType: Boolean
  
  var `type`: Double
  
  var undo: js.Function
}
object Cmd {
  
  inline def apply(
    cmd: js.Function,
    keepUndo: Boolean,
    mustExec: Boolean,
    overwriteIfSameType: Boolean,
    `type`: Double,
    undo: js.Function
  ): Cmd = {
    val __obj = js.Dynamic.literal(cmd = cmd.asInstanceOf[js.Any], keepUndo = keepUndo.asInstanceOf[js.Any], mustExec = mustExec.asInstanceOf[js.Any], overwriteIfSameType = overwriteIfSameType.asInstanceOf[js.Any], undo = undo.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cmd]
  }
  
  extension [Self <: Cmd](x: Self) {
    
    inline def setCmd(value: js.Function): Self = StObject.set(x, "cmd", value.asInstanceOf[js.Any])
    
    inline def setKeepUndo(value: Boolean): Self = StObject.set(x, "keepUndo", value.asInstanceOf[js.Any])
    
    inline def setMustExec(value: Boolean): Self = StObject.set(x, "mustExec", value.asInstanceOf[js.Any])
    
    inline def setOverwriteIfSameType(value: Boolean): Self = StObject.set(x, "overwriteIfSameType", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUndo(value: js.Function): Self = StObject.set(x, "undo", value.asInstanceOf[js.Any])
  }
}
