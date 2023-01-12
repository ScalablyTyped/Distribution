package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileTime extends StObject {
  
  var compileTime: Double
  
  var fsCompiled: Double
  
  var linked: Double
  
  var materialShaders: Double
  
  var vsCompiled: Double
}
object CompileTime {
  
  inline def apply(
    compileTime: Double,
    fsCompiled: Double,
    linked: Double,
    materialShaders: Double,
    vsCompiled: Double
  ): CompileTime = {
    val __obj = js.Dynamic.literal(compileTime = compileTime.asInstanceOf[js.Any], fsCompiled = fsCompiled.asInstanceOf[js.Any], linked = linked.asInstanceOf[js.Any], materialShaders = materialShaders.asInstanceOf[js.Any], vsCompiled = vsCompiled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompileTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompileTime] (val x: Self) extends AnyVal {
    
    inline def setCompileTime(value: Double): Self = StObject.set(x, "compileTime", value.asInstanceOf[js.Any])
    
    inline def setFsCompiled(value: Double): Self = StObject.set(x, "fsCompiled", value.asInstanceOf[js.Any])
    
    inline def setLinked(value: Double): Self = StObject.set(x, "linked", value.asInstanceOf[js.Any])
    
    inline def setMaterialShaders(value: Double): Self = StObject.set(x, "materialShaders", value.asInstanceOf[js.Any])
    
    inline def setVsCompiled(value: Double): Self = StObject.set(x, "vsCompiled", value.asInstanceOf[js.Any])
  }
}
