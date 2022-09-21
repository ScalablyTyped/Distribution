package typings.pngAsync

import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("png-async/lib/parser", JSImport.Namespace)
  @js.native
  open class ^ protected () extends Parser {
    def this(option: IImageOptions) = this()
  }
  
  @js.native
  trait Parser
    extends typings.pngAsync.chunkStreamMod.^ {
    
    /* private */ var _chunks: Any = js.native
    
    /* private */ var _colorType: Any = js.native
    
    /* private */ var _crc: Any = js.native
    
    /* private */ var _data: Any = js.native
    
    /* private */ var _filter: Any = js.native
    
    /* private */ var _handleChunkEnd: Any = js.native
    
    /* private */ var _handleError: Any = js.native
    
    /* private */ var _handleGAMA: Any = js.native
    
    /* private */ var _handleIDAT: Any = js.native
    
    /* private */ var _handleIEND: Any = js.native
    
    /* private */ var _handleIHDR: Any = js.native
    
    /* private */ var _handlePLTE: Any = js.native
    
    /* private */ var _handleSignature: Any = js.native
    
    /* private */ var _handleTRNS: Any = js.native
    
    /* private */ var _hasIEND: Any = js.native
    
    /* private */ var _hasIHDR: Any = js.native
    
    /* private */ var _inflate: Any = js.native
    
    /* private */ var _option: Any = js.native
    
    /* private */ var _palette: Any = js.native
    
    /* private */ var _parseChunkBegin: Any = js.native
    
    /* private */ var _parseChunkEnd: Any = js.native
    
    /* private */ var _parseGAMA: Any = js.native
    
    /* private */ var _parseIDAT: Any = js.native
    
    /* private */ var _parseIEND: Any = js.native
    
    /* private */ var _parseIHDR: Any = js.native
    
    /* private */ var _parsePLTE: Any = js.native
    
    /* private */ var _parseSignature: Any = js.native
    
    /* private */ var _parseTRNS: Any = js.native
    
    /* private */ var _reverseFiltered: Any = js.native
    
    /* private */ var _skipChunk: Any = js.native
  }
}
