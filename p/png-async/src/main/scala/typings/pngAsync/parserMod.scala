package typings.pngAsync

import typings.pngAsync.mod.IImageOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object parserMod {
  
  @JSImport("png-async/lib/parser", JSImport.Namespace)
  @js.native
  class ^ protected () extends Parser {
    def this(option: IImageOptions) = this()
  }
  
  @js.native
  trait Parser
    extends typings.pngAsync.chunkStreamMod.^ {
    
    /* private */ var _chunks: js.Any = js.native
    
    /* private */ var _colorType: js.Any = js.native
    
    /* private */ var _crc: js.Any = js.native
    
    /* private */ var _data: js.Any = js.native
    
    /* private */ var _filter: js.Any = js.native
    
    /* private */ var _handleChunkEnd: js.Any = js.native
    
    /* private */ var _handleError: js.Any = js.native
    
    /* private */ var _handleGAMA: js.Any = js.native
    
    /* private */ var _handleIDAT: js.Any = js.native
    
    /* private */ var _handleIEND: js.Any = js.native
    
    /* private */ var _handleIHDR: js.Any = js.native
    
    /* private */ var _handlePLTE: js.Any = js.native
    
    /* private */ var _handleSignature: js.Any = js.native
    
    /* private */ var _handleTRNS: js.Any = js.native
    
    /* private */ var _hasIEND: js.Any = js.native
    
    /* private */ var _hasIHDR: js.Any = js.native
    
    /* private */ var _inflate: js.Any = js.native
    
    /* private */ var _option: js.Any = js.native
    
    /* private */ var _palette: js.Any = js.native
    
    /* private */ var _parseChunkBegin: js.Any = js.native
    
    /* private */ var _parseChunkEnd: js.Any = js.native
    
    /* private */ var _parseGAMA: js.Any = js.native
    
    /* private */ var _parseIDAT: js.Any = js.native
    
    /* private */ var _parseIEND: js.Any = js.native
    
    /* private */ var _parseIHDR: js.Any = js.native
    
    /* private */ var _parsePLTE: js.Any = js.native
    
    /* private */ var _parseSignature: js.Any = js.native
    
    /* private */ var _parseTRNS: js.Any = js.native
    
    /* private */ var _reverseFiltered: js.Any = js.native
    
    /* private */ var _skipChunk: js.Any = js.native
  }
}
