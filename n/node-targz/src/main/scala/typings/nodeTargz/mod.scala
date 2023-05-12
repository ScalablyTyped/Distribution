package typings.nodeTargz

import typings.node.fsMod.PathLike
import typings.tarFs.mod.ExtractOptions
import typings.tarFs.mod.PackOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-targz", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compress(options: CompressOptions, cb: js.Function1[/* error */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compress")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def decompress(options: DecompressOptions, cb: js.Function1[/* error */ js.Error | Null, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decompress")(options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CompressOptions extends StObject {
    
    var destination: PathLike
    
    var level: js.UndefOr[Double] = js.undefined
    
    var memLevel: js.UndefOr[Double] = js.undefined
    
    /** Options to pass down to tar-fs */
    var options: js.UndefOr[PackOptions] = js.undefined
    
    var source: String
  }
  object CompressOptions {
    
    inline def apply(destination: PathLike, source: String): CompressOptions = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressOptions] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: PathLike): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setMemLevel(value: Double): Self = StObject.set(x, "memLevel", value.asInstanceOf[js.Any])
      
      inline def setMemLevelUndefined: Self = StObject.set(x, "memLevel", js.undefined)
      
      inline def setOptions(value: PackOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  trait DecompressOptions extends StObject {
    
    var destination: String
    
    /** Options to pass down to tar-fs */
    var options: js.UndefOr[ExtractOptions] = js.undefined
    
    var source: PathLike
  }
  object DecompressOptions {
    
    inline def apply(destination: String, source: PathLike): DecompressOptions = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[DecompressOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DecompressOptions] (val x: Self) extends AnyVal {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: ExtractOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setSource(value: PathLike): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
