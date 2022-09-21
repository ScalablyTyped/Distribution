package typings.parse5

import typings.parse5.anon.OnParseError
import typings.parse5.errorCodesMod.ERR
import typings.parse5.errorCodesMod.ParserError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object preprocessorMod {
  
  @JSImport("parse5/dist/cjs/tokenizer/preprocessor", "Preprocessor")
  @js.native
  open class Preprocessor protected () extends StObject {
    def this(handler: OnParseError) = this()
    
    /* private */ var _addGap: Any = js.native
    
    /* private */ var _checkForProblematicCharacters: Any = js.native
    
    /* private */ var _err: Any = js.native
    
    /* private */ var _processSurrogate: Any = js.native
    
    def advance(): Double = js.native
    
    var bufferWaterline: Double = js.native
    
    /** The column on the current line. If we just saw a gap (eg. a surrogate pair), return the index before. */
    def col: Double = js.native
    
    def dropParsedChunk(): Unit = js.native
    
    var droppedBufferSize: Double = js.native
    
    var endOfChunkHit: Boolean = js.native
    
    /* private */ var gapStack: Any = js.native
    
    def getError(code: ERR): ParserError = js.native
    
    /* private */ var handler: Any = js.native
    
    var html: String = js.native
    
    def insertHtmlAtCurrentPos(chunk: String): Unit = js.native
    
    /* private */ var isEol: Any = js.native
    
    /* private */ var lastChunkWritten: Any = js.native
    
    /* private */ var lastErrOffset: Any = js.native
    
    /* private */ var lastGapPos: Any = js.native
    
    var line: Double = js.native
    
    /* private */ var lineStartPos: Any = js.native
    
    def offset: Double = js.native
    
    def peek(offset: Double): Double = js.native
    
    /* private */ var pos: Any = js.native
    
    def retreat(count: Double): Unit = js.native
    
    /* private */ var skipNextNewLine: Any = js.native
    
    def startsWith(pattern: String, caseSensitive: Boolean): Boolean = js.native
    
    def willDropParsedChunk(): Boolean = js.native
    
    def write(chunk: String, isLastChunk: Boolean): Unit = js.native
  }
}
