package typings.micromarkUtilEventsToAcorn

import typings.acorn.mod.Node
import typings.micromarkUtilTypes.mod.Point
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-events-to-acorn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventsToAcorn(events: js.Array[typings.micromarkUtilTypes.mod.Event], options: Options): Result = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsToAcorn")(events.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Result]
  
  trait Acorn extends StObject {
    
    /**
      *   Parse a program.
      */
    def parse(input: String, options: typings.acorn.mod.Options): Node
    
    /**
      *   Parse an expression.
      */
    def parseExpressionAt(input: String, pos: Double, options: typings.acorn.mod.Options): Node
    /**
      *   Parse an expression.
      */
    @JSName("parseExpressionAt")
    var parseExpressionAt_Original: js.Function3[/* input */ String, /* pos */ Double, /* options */ typings.acorn.mod.Options, Node]
    
    /**
      *   Parse a program.
      */
    @JSName("parse")
    var parse_Original: js.Function2[/* input */ String, /* options */ typings.acorn.mod.Options, Node]
  }
  object Acorn {
    
    inline def apply(
      parse: (/* input */ String, /* options */ typings.acorn.mod.Options) => Node,
      parseExpressionAt: (/* input */ String, /* pos */ Double, /* options */ typings.acorn.mod.Options) => Node
    ): Acorn = {
      val __obj = js.Dynamic.literal(parse = js.Any.fromFunction2(parse), parseExpressionAt = js.Any.fromFunction3(parseExpressionAt))
      __obj.asInstanceOf[Acorn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Acorn] (val x: Self) extends AnyVal {
      
      inline def setParse(value: (/* input */ String, /* options */ typings.acorn.mod.Options) => Node): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseExpressionAt(value: (/* input */ String, /* pos */ Double, /* options */ typings.acorn.mod.Options) => Node): Self = StObject.set(x, "parseExpressionAt", js.Any.fromFunction3(value))
    }
  }
  
  trait AcornError
    extends StObject
       with Error
       with AcornErrorFields
  object AcornError {
    
    inline def apply(loc: AcornLoc, message: String, name: String, pos: Double, raisedAt: Double): AcornError = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], raisedAt = raisedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcornError]
    }
  }
  
  trait AcornErrorFields extends StObject {
    
    var loc: AcornLoc
    
    var pos: Double
    
    var raisedAt: Double
  }
  object AcornErrorFields {
    
    inline def apply(loc: AcornLoc, pos: Double, raisedAt: Double): AcornErrorFields = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], raisedAt = raisedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcornErrorFields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcornErrorFields] (val x: Self) extends AnyVal {
      
      inline def setLoc(value: AcornLoc): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRaisedAt(value: Double): Self = StObject.set(x, "raisedAt", value.asInstanceOf[js.Any])
    }
  }
  
  trait AcornLoc extends StObject {
    
    var column: Double
    
    var line: Double
  }
  object AcornLoc {
    
    inline def apply(column: Double, line: Double): AcornLoc = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcornLoc]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AcornLoc] (val x: Self) extends AnyVal {
      
      inline def setColumn(value: Double): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  type AcornNode = Node
  
  type AcornOptions = typings.acorn.mod.Options
  
  type Chunk = typings.micromarkUtilTypes.mod.Chunk
  
  trait Collection extends StObject {
    
    var stops: js.Array[Stop]
    
    var value: String
  }
  object Collection {
    
    inline def apply(stops: js.Array[Stop], value: String): Collection = {
      val __obj = js.Dynamic.literal(stops = stops.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Collection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Collection] (val x: Self) extends AnyVal {
      
      inline def setStops(value: js.Array[Stop]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
      
      inline def setStopsVarargs(value: Stop*): Self = StObject.set(x, "stops", js.Array(value*))
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type Comment = typings.acorn.mod.Comment
  
  type EstreeNode = typings.estree.mod.Node
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  type MicromarkPoint = Point
  
  trait Options extends StObject {
    
    /**
      * Typically `acorn`, object with `parse` and `parseExpressionAt` fields.
      */
    var acorn: Acorn
    
    /**
      * Configuration for `acorn`.
      */
    var acornOptions: js.UndefOr[AcornOptions | Null] = js.undefined
    
    /**
      * Whether an empty expression is allowed (programs are always allowed to
      * be empty).
      */
    var allowEmpty: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Whether this is a program or expression.
      */
    var expression: js.UndefOr[Boolean | Null] = js.undefined
    
    /**
      * Text to place before events.
      */
    var prefix: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Place where events start.
      */
    var start: js.UndefOr[MicromarkPoint | Null] = js.undefined
    
    /**
      * Text to place after events.
      */
    var suffix: js.UndefOr[String | Null] = js.undefined
  }
  object Options {
    
    inline def apply(acorn: Acorn): Options = {
      val __obj = js.Dynamic.literal(acorn = acorn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAcorn(value: Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornOptions(value: AcornOptions): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsNull: Self = StObject.set(x, "acornOptions", null)
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyNull: Self = StObject.set(x, "allowEmpty", null)
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionNull: Self = StObject.set(x, "expression", null)
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStart(value: MicromarkPoint): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartNull: Self = StObject.set(x, "start", null)
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixNull: Self = StObject.set(x, "suffix", null)
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type Program = typings.estree.mod.Program
  
  trait Result extends StObject {
    
    /**
      * Error if unparseable
      */
    var error: js.UndefOr[AcornError] = js.undefined
    
    /**
      * Program.
      */
    var estree: js.UndefOr[Program] = js.undefined
    
    /**
      * Whether the error, if there is one, can be swallowed and more JavaScript
      * could be valid.
      */
    var swallow: Boolean
  }
  object Result {
    
    inline def apply(swallow: Boolean): Result = {
      val __obj = js.Dynamic.literal(swallow = swallow.asInstanceOf[js.Any])
      __obj.asInstanceOf[Result]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Result] (val x: Self) extends AnyVal {
      
      inline def setError(value: AcornError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setEstree(value: Program): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
      
      inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
      
      inline def setSwallow(value: Boolean): Self = StObject.set(x, "swallow", value.asInstanceOf[js.Any])
    }
  }
  
  type Stop = js.Tuple2[Double, MicromarkPoint]
  
  type Token = typings.acorn.mod.Token
  
  type UnistPoint = typings.unist.mod.Point
}
