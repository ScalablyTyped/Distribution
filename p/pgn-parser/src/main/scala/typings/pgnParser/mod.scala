package typings.pgnParser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("pgn-parser", JSImport.Namespace)
  @js.native
  val ^ : PgnParser = js.native
  
  // Game ongoing or result inconclusive
  /**
    * A PGN comment.
    */
  trait Comment extends StObject {
    
    var text: String
  }
  object Comment {
    
    inline def apply(text: String): Comment = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A PGN header.
    */
  trait Header extends StObject {
    
    /**
      * The name of the header.
      * For the header '[Date "2004.01.24"]' the name is 'Date'
      * For the header '[White "Magnus Carlsen"]' the name is 'White'
      */
    var name: String
    
    /**
      * The value of the header.
      * For the header '[Date "2004.01.24"]' the value is '2004.01.24'
      * For the header '[White "Magnus Carlsen"]' the value is 'Magnus Carlsen'
      */
    var value: String
  }
  object Header {
    
    inline def apply(name: String, value: String): Header = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Header]
    }
    
    extension [Self <: Header](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A chess half-move (one ply).
    */
  trait Move extends StObject {
    
    /**
      * The list of comments that are associated with this move.
      */
    var comments: js.Array[String]
    
    /**
      * A single half-move, such as 'Nf6' or 'd4'
      */
    var move: String
    
    /**
      * The number of the move. Moves made by white will have a move_number, but black
      * moves will not.
      */
    var move_number: js.UndefOr[Double] = js.undefined
    
    /**
      * A list of alternative sequences of moves. The first move of each Rav is an
      * alternative to this move. If the PGN does not provide alternatives for this
      * move, ravs will be undefined.
      */
    var ravs: js.UndefOr[js.Array[Rav]] = js.undefined
  }
  object Move {
    
    inline def apply(comments: js.Array[String], move: String): Move = {
      val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], move = move.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move]
    }
    
    extension [Self <: Move](x: Self) {
      
      inline def setComments(value: js.Array[String]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsVarargs(value: String*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setMove(value: String): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setMove_number(value: Double): Self = StObject.set(x, "move_number", value.asInstanceOf[js.Any])
      
      inline def setMove_numberUndefined: Self = StObject.set(x, "move_number", js.undefined)
      
      inline def setRavs(value: js.Array[Rav]): Self = StObject.set(x, "ravs", value.asInstanceOf[js.Any])
      
      inline def setRavsUndefined: Self = StObject.set(x, "ravs", js.undefined)
      
      inline def setRavsVarargs(value: Rav*): Self = StObject.set(x, "ravs", js.Array(value*))
    }
  }
  
  /**
    * The type returned by the parse function (if the parse was successful).
    */
  trait ParsedPGN extends StObject {
    
    /**
      * The comments that were between the headers and the moves. This will be null if
      * there were no comments between the headers and the moves.
      */
    var comments: js.Array[Comment] | Null
    
    /**
      * A list of the comments that were above the headers. This will be null if there
      * were no comments above the headers.
      */
    var comments_above_header: js.Array[Comment] | Null
    
    /**
      * The headers of the pgn. This will be null if there were no headers.
      */
    var headers: js.Array[Header] | Null
    
    /**
      * The moves of the game
      */
    var moves: js.Array[Move]
    
    /**
      * The result of the game
      */
    var result: Result
  }
  object ParsedPGN {
    
    inline def apply(moves: js.Array[Move], result: Result): ParsedPGN = {
      val __obj = js.Dynamic.literal(moves = moves.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], comments = null, comments_above_header = null, headers = null)
      __obj.asInstanceOf[ParsedPGN]
    }
    
    extension [Self <: ParsedPGN](x: Self) {
      
      inline def setComments(value: js.Array[Comment]): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
      
      inline def setCommentsNull: Self = StObject.set(x, "comments", null)
      
      inline def setCommentsVarargs(value: Comment*): Self = StObject.set(x, "comments", js.Array(value*))
      
      inline def setComments_above_header(value: js.Array[Comment]): Self = StObject.set(x, "comments_above_header", value.asInstanceOf[js.Any])
      
      inline def setComments_above_headerNull: Self = StObject.set(x, "comments_above_header", null)
      
      inline def setComments_above_headerVarargs(value: Comment*): Self = StObject.set(x, "comments_above_header", js.Array(value*))
      
      inline def setHeaders(value: js.Array[Header]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersNull: Self = StObject.set(x, "headers", null)
      
      inline def setHeadersVarargs(value: Header*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setMoves(value: js.Array[Move]): Self = StObject.set(x, "moves", value.asInstanceOf[js.Any])
      
      inline def setMovesVarargs(value: Move*): Self = StObject.set(x, "moves", js.Array(value*))
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait PgnParser extends StObject {
    
    /**
      * Parse a PGN string. Throw an error if the parse is unsuccessful.
      *
      * @param pgnString
      * @throws {SyntaxError}
      */
    def parse(pgnString: String): js.Array[ParsedPGN]
  }
  object PgnParser {
    
    inline def apply(parse: String => js.Array[ParsedPGN]): PgnParser = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction1(parse))
      __obj.asInstanceOf[PgnParser]
    }
    
    extension [Self <: PgnParser](x: Self) {
      
      inline def setParse(value: String => js.Array[ParsedPGN]): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * An alternative sequence of moves.
    */
  trait Rav extends StObject {
    
    /**
      * The list of moves.
      */
    var moves: js.Array[Move]
    
    /**
      * The result of the sequence of moves.
      */
    var result: Result | Null
  }
  object Rav {
    
    inline def apply(moves: js.Array[Move]): Rav = {
      val __obj = js.Dynamic.literal(moves = moves.asInstanceOf[js.Any], result = null)
      __obj.asInstanceOf[Rav]
    }
    
    extension [Self <: Rav](x: Self) {
      
      inline def setMoves(value: js.Array[Move]): Self = StObject.set(x, "moves", value.asInstanceOf[js.Any])
      
      inline def setMovesVarargs(value: Move*): Self = StObject.set(x, "moves", js.Array(value*))
      
      inline def setResult(value: Result): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      inline def setResultNull: Self = StObject.set(x, "result", null)
    }
  }
  
  /**
    * The result of a game or sequence of moves.
    */
  /* Rewritten from type alias, can be one of: 
    - typings.pgnParser.pgnParserStrings.`1-0`
    - typings.pgnParser.pgnParserStrings.`0-1`
    - typings.pgnParser.pgnParserStrings.`1Slash2-1Slash2`
    - typings.pgnParser.pgnParserStrings.Asterisk
  */
  trait Result extends StObject
  object Result {
    
    inline def `0-1`: typings.pgnParser.pgnParserStrings.`0-1` = "0-1".asInstanceOf[typings.pgnParser.pgnParserStrings.`0-1`]
    
    inline def `1-0`: typings.pgnParser.pgnParserStrings.`1-0` = "1-0".asInstanceOf[typings.pgnParser.pgnParserStrings.`1-0`]
    
    inline def `1Slash2-1Slash2`: typings.pgnParser.pgnParserStrings.`1Slash2-1Slash2` = "1/2-1/2".asInstanceOf[typings.pgnParser.pgnParserStrings.`1Slash2-1Slash2`]
    
    inline def Asterisk: typings.pgnParser.pgnParserStrings.Asterisk = "*".asInstanceOf[typings.pgnParser.pgnParserStrings.Asterisk]
  }
  
  type _To = PgnParser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: PgnParser = ^
}
