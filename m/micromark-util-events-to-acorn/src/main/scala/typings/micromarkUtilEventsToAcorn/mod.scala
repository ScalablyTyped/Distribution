package typings.micromarkUtilEventsToAcorn

import typings.acorn.mod.Node
import typings.micromarkUtilEventsToAcorn.anon.Column
import typings.micromarkUtilEventsToAcorn.anon.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-util-events-to-acorn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def eventsToAcorn(events: js.Array[typings.micromarkUtilTypes.mod.Event], options: Options): Error = (^.asInstanceOf[js.Dynamic].applyDynamic("eventsToAcorn")(events.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Error]
  
  trait Acorn extends StObject {
    
    def parse(input: String, options: typings.acorn.mod.Options): Node
    
    def parseExpressionAt(input: String, pos: Double, options: typings.acorn.mod.Options): Node
    @JSName("parseExpressionAt")
    var parseExpressionAt_Original: js.Function3[/* input */ String, /* pos */ Double, /* options */ typings.acorn.mod.Options, Node]
    
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
    
    extension [Self <: Acorn](x: Self) {
      
      inline def setParse(value: (/* input */ String, /* options */ typings.acorn.mod.Options) => Node): Self = StObject.set(x, "parse", js.Any.fromFunction2(value))
      
      inline def setParseExpressionAt(value: (/* input */ String, /* pos */ Double, /* options */ typings.acorn.mod.Options) => Node): Self = StObject.set(x, "parseExpressionAt", js.Any.fromFunction3(value))
    }
  }
  
  trait AcornError
    extends StObject
       with typings.std.Error {
    
    var loc: Column
    
    var pos: Double
    
    var raisedAt: Double
  }
  object AcornError {
    
    inline def apply(loc: Column, message: String, name: String, pos: Double, raisedAt: Double): AcornError = {
      val __obj = js.Dynamic.literal(loc = loc.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], raisedAt = raisedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AcornError]
    }
    
    extension [Self <: AcornError](x: Self) {
      
      inline def setLoc(value: Column): Self = StObject.set(x, "loc", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setRaisedAt(value: Double): Self = StObject.set(x, "raisedAt", value.asInstanceOf[js.Any])
    }
  }
  
  type AcornNode = Node
  
  type AcornOptions = typings.acorn.mod.Options
  
  type Comment = typings.acorn.mod.Comment
  
  type EstreeNode = typings.estreeUtilVisit.mod.Node
  
  type Event = typings.micromarkUtilTypes.mod.Event
  
  trait Options extends StObject {
    
    var acorn: Acorn
    
    var acornOptions: js.UndefOr[typings.acorn.mod.Options] = js.undefined
    
    var allowEmpty: js.UndefOr[Boolean] = js.undefined
    
    var expression: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var start: js.UndefOr[typings.micromarkUtilTypes.mod.Point] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(acorn: Acorn): Options = {
      val __obj = js.Dynamic.literal(acorn = acorn.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAcorn(value: Acorn): Self = StObject.set(x, "acorn", value.asInstanceOf[js.Any])
      
      inline def setAcornOptions(value: typings.acorn.mod.Options): Self = StObject.set(x, "acornOptions", value.asInstanceOf[js.Any])
      
      inline def setAcornOptionsUndefined: Self = StObject.set(x, "acornOptions", js.undefined)
      
      inline def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      inline def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      inline def setExpression(value: Boolean): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
      
      inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setStart(value: typings.micromarkUtilTypes.mod.Point): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  type Point = typings.micromarkUtilTypes.mod.Point
  
  type Program = typings.estree.mod.Program
  
  type Token = typings.acorn.mod.Token
}
