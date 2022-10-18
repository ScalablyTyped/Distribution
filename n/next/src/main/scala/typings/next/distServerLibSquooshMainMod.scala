package typings.next

import typings.next.anon.Width
import typings.next.distServerLibSquooshImageDataMod.default
import typings.next.nextStrings.avif_
import typings.next.nextStrings.rotate_
import typings.next.nextStrings.webp_
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServerLibSquooshMainMod {
  
  @JSImport("next/dist/server/lib/squoosh/main", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def decodeBuffer(buffer: Buffer): js.Promise[default] = ^.asInstanceOf[js.Dynamic].applyDynamic("decodeBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[default]]
  
  inline def getMetadata(buffer: Buffer): js.Promise[Width] = ^.asInstanceOf[js.Dynamic].applyDynamic("getMetadata")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Width]]
  
  inline def processBuffer(buffer: Buffer, operations: js.Array[Operation], encoding: Encoding, quality: Double): js.Promise[Buffer] = (^.asInstanceOf[js.Dynamic].applyDynamic("processBuffer")(buffer.asInstanceOf[js.Any], operations.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any], quality.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Buffer]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.nextStrings.jpeg
    - typings.next.nextStrings.png
    - typings.next.nextStrings.webp_
    - typings.next.nextStrings.avif_
  */
  trait Encoding extends StObject
  object Encoding {
    
    inline def avif: avif_ = "avif".asInstanceOf[avif_]
    
    inline def jpeg: typings.next.nextStrings.jpeg = "jpeg".asInstanceOf[typings.next.nextStrings.jpeg]
    
    inline def png: typings.next.nextStrings.png = "png".asInstanceOf[typings.next.nextStrings.png]
    
    inline def webp: webp_ = "webp".asInstanceOf[webp_]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.distServerLibSquooshMainMod.RotateOperation
    - typings.next.distServerLibSquooshMainMod.ResizeOperation
  */
  trait Operation extends StObject
  object Operation {
    
    inline def RotateOperation(numRotations: Double): typings.next.distServerLibSquooshMainMod.RotateOperation = {
      val __obj = js.Dynamic.literal(numRotations = numRotations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rotate")
      __obj.asInstanceOf[typings.next.distServerLibSquooshMainMod.RotateOperation]
    }
    
    inline def heightnumberwidthneverundHeight(height: Double): typings.next.anon.heightnumberwidthneverundHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.heightnumberwidthneverundHeight]
    }
    
    inline def widthnumberheightneverundHeight(width: Double): typings.next.anon.widthnumberheightneverundHeight = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.widthnumberheightneverundHeight]
    }
    
    inline def widthnumberheightnumberty(height: Double, width: Double): typings.next.anon.widthnumberheightnumberty = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.widthnumberheightnumberty]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.next.anon.widthnumberheightneverundHeight
    - typings.next.anon.heightnumberwidthneverundHeight
    - typings.next.anon.widthnumberheightnumberty
  */
  trait ResizeOperation
    extends StObject
       with Operation
  object ResizeOperation {
    
    inline def heightnumberwidthneverundHeight(height: Double): typings.next.anon.heightnumberwidthneverundHeight = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.heightnumberwidthneverundHeight]
    }
    
    inline def widthnumberheightneverundHeight(width: Double): typings.next.anon.widthnumberheightneverundHeight = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.widthnumberheightneverundHeight]
    }
    
    inline def widthnumberheightnumberty(height: Double, width: Double): typings.next.anon.widthnumberheightnumberty = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("resize")
      __obj.asInstanceOf[typings.next.anon.widthnumberheightnumberty]
    }
  }
  
  trait RotateOperation
    extends StObject
       with Operation {
    
    var numRotations: Double
    
    var `type`: rotate_
  }
  object RotateOperation {
    
    inline def apply(numRotations: Double): RotateOperation = {
      val __obj = js.Dynamic.literal(numRotations = numRotations.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("rotate")
      __obj.asInstanceOf[RotateOperation]
    }
    
    extension [Self <: RotateOperation](x: Self) {
      
      inline def setNumRotations(value: Double): Self = StObject.set(x, "numRotations", value.asInstanceOf[js.Any])
      
      inline def setType(value: rotate_): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
