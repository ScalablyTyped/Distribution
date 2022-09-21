package typings.nivoGenerators

import typings.nivoGenerators.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parallelCoordinatesMod {
  
  @JSImport("@nivo/generators/dist/types/parallelCoordinates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def generateParallelCoordinatesData(): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")().asInstanceOf[js.Array[js.Object]]
  inline def generateParallelCoordinatesData(hasSizeKeys: Options): js.Array[js.Object] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateParallelCoordinatesData")(hasSizeKeys.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Object]]
  
  /* Inlined std.Partial<{  size :number,   keys :std.Array<{  key :string,   random :[number, number] | undefined,   shuffle :std.Array<string> | undefined}>}> */
  trait Options extends StObject {
    
    var keys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setKeys(value: js.Array[Key]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: Key*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
