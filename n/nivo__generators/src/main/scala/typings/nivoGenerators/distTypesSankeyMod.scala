package typings.nivoGenerators

import typings.nivoGenerators.anon.MaxIterations
import typings.nivoGenerators.anon.Nodes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesSankeyMod {
  
  @JSImport("@nivo/generators/dist/types/sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateSankeyData(): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")().asInstanceOf[Nodes]
  inline def generateSankeyData(hasNodeCountMaxIterations: MaxIterations): Nodes = ^.asInstanceOf[js.Dynamic].applyDynamic("generateSankeyData")(hasNodeCountMaxIterations.asInstanceOf[js.Any]).asInstanceOf[Nodes]
  
  trait Link extends StObject {
    
    var source: String
    
    var target: String
    
    var value: Double
  }
  object Link {
    
    inline def apply(source: String, target: String, value: Double): Link = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Link]
    }
    
    extension [Self <: Link](x: Self) {
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
