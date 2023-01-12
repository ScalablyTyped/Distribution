package typings.pixiCompressedTextures

import typings.pixiCompressedTextures.libResourcesMod.CompressedTextureResource
import typings.pixiConstants.mod.FORMATS
import typings.pixiConstants.mod.TYPES
import typings.pixiCore.mod.BufferResource
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Compressed extends StObject {
    
    var compressed: js.UndefOr[js.Array[CompressedTextureResource]] = js.undefined
    
    var kvData: (Map[String, js.typedarray.DataView]) | Null
    
    var uncompressed: js.UndefOr[js.Array[Format]] = js.undefined
  }
  object Compressed {
    
    inline def apply(): Compressed = {
      val __obj = js.Dynamic.literal(kvData = null)
      __obj.asInstanceOf[Compressed]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Compressed] (val x: Self) extends AnyVal {
      
      inline def setCompressed(value: js.Array[CompressedTextureResource]): Self = StObject.set(x, "compressed", value.asInstanceOf[js.Any])
      
      inline def setCompressedUndefined: Self = StObject.set(x, "compressed", js.undefined)
      
      inline def setCompressedVarargs(value: CompressedTextureResource*): Self = StObject.set(x, "compressed", js.Array(value*))
      
      inline def setKvData(value: Map[String, js.typedarray.DataView]): Self = StObject.set(x, "kvData", value.asInstanceOf[js.Any])
      
      inline def setKvDataNull: Self = StObject.set(x, "kvData", null)
      
      inline def setUncompressed(value: js.Array[Format]): Self = StObject.set(x, "uncompressed", value.asInstanceOf[js.Any])
      
      inline def setUncompressedUndefined: Self = StObject.set(x, "uncompressed", js.undefined)
      
      inline def setUncompressedVarargs(value: Format*): Self = StObject.set(x, "uncompressed", js.Array(value*))
    }
  }
  
  trait Format extends StObject {
    
    var format: FORMATS
    
    var resource: BufferResource
    
    var `type`: TYPES
  }
  object Format {
    
    inline def apply(format: FORMATS, resource: BufferResource, `type`: TYPES): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      inline def setFormat(value: FORMATS): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setResource(value: BufferResource): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setType(value: TYPES): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
