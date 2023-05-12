package typings.playcanvas.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Colors extends StObject {
  
  var colors: Background
  
  var cpu: Enabled
  
  var gpu: Enabled
  
  var sizes: js.Array[Graphs]
  
  var startSizeIndex: Double
  
  var stats: js.Array[DecimalPlaces | Name]
  
  var textRefreshRate: Double
}
object Colors {
  
  inline def apply(
    colors: Background,
    cpu: Enabled,
    gpu: Enabled,
    sizes: js.Array[Graphs],
    startSizeIndex: Double,
    stats: js.Array[DecimalPlaces | Name],
    textRefreshRate: Double
  ): Colors = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], cpu = cpu.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], startSizeIndex = startSizeIndex.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any], textRefreshRate = textRefreshRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Colors]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Colors] (val x: Self) extends AnyVal {
    
    inline def setColors(value: Background): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setCpu(value: Enabled): Self = StObject.set(x, "cpu", value.asInstanceOf[js.Any])
    
    inline def setGpu(value: Enabled): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
    
    inline def setSizes(value: js.Array[Graphs]): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
    
    inline def setSizesVarargs(value: Graphs*): Self = StObject.set(x, "sizes", js.Array(value*))
    
    inline def setStartSizeIndex(value: Double): Self = StObject.set(x, "startSizeIndex", value.asInstanceOf[js.Any])
    
    inline def setStats(value: js.Array[DecimalPlaces | Name]): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    
    inline def setStatsVarargs(value: (DecimalPlaces | Name)*): Self = StObject.set(x, "stats", js.Array(value*))
    
    inline def setTextRefreshRate(value: Double): Self = StObject.set(x, "textRefreshRate", value.asInstanceOf[js.Any])
  }
}
