package typings.micromarkFactoryMdxExpression

import typings.micromarkFactoryMdxExpression.micromarkFactoryMdxExpressionStrings.nok
import typings.micromarkFactoryMdxExpression.micromarkFactoryMdxExpressionStrings.ok
import typings.vfileMessage.mod.VFileMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("micromark-factory-mdx-expression", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def factoryMdxExpression(
    effects: Effects,
    ok: State,
    `type`: TokenType,
    markerType: TokenType,
    chunkType: TokenType,
    acorn: js.UndefOr[Acorn | Null],
    acornOptions: js.UndefOr[AcornOptions | Null],
    addResult: js.UndefOr[Boolean | Null],
    spread: js.UndefOr[Boolean | Null],
    allowEmpty: js.UndefOr[Boolean | Null],
    allowLazy: js.UndefOr[Boolean | Null]
  ): State = (^.asInstanceOf[js.Dynamic].applyDynamic("factoryMdxExpression")(effects.asInstanceOf[js.Any], ok.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], markerType.asInstanceOf[js.Any], chunkType.asInstanceOf[js.Any], acorn.asInstanceOf[js.Any], acornOptions.asInstanceOf[js.Any], addResult.asInstanceOf[js.Any], spread.asInstanceOf[js.Any], allowEmpty.asInstanceOf[js.Any], allowLazy.asInstanceOf[js.Any])).asInstanceOf[State]
  
  type Acorn = typings.micromarkUtilEventsToAcorn.mod.Acorn
  
  type AcornOptions = typings.micromarkUtilEventsToAcorn.mod.AcornOptions
  
  type Effects = typings.micromarkUtilTypes.mod.Effects
  
  /* Rewritten from type alias, can be one of: 
    - typings.micromarkFactoryMdxExpression.mod.MdxSignalOk
    - typings.micromarkFactoryMdxExpression.mod.MdxSignalNok
  */
  trait MdxSignal extends StObject
  object MdxSignal {
    
    inline def MdxSignalNok(message: VFileMessage): typings.micromarkFactoryMdxExpression.mod.MdxSignalNok = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nok")
      __obj.asInstanceOf[typings.micromarkFactoryMdxExpression.mod.MdxSignalNok]
    }
    
    inline def MdxSignalOk(): typings.micromarkFactoryMdxExpression.mod.MdxSignalOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ok")
      __obj.asInstanceOf[typings.micromarkFactoryMdxExpression.mod.MdxSignalOk]
    }
  }
  
  trait MdxSignalNok
    extends StObject
       with MdxSignal {
    
    /**
      *   Value.
      */
    var message: VFileMessage
    
    /**
      *   Type.
      */
    var `type`: nok
  }
  object MdxSignalNok {
    
    inline def apply(message: VFileMessage): MdxSignalNok = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("nok")
      __obj.asInstanceOf[MdxSignalNok]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxSignalNok] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: VFileMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setType(value: nok): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait MdxSignalOk
    extends StObject
       with MdxSignal {
    
    /**
      *   Value.
      */
    var estree: js.UndefOr[Program] = js.undefined
    
    /**
      *   Type.
      */
    var `type`: ok
  }
  object MdxSignalOk {
    
    inline def apply(): MdxSignalOk = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")("ok")
      __obj.asInstanceOf[MdxSignalOk]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MdxSignalOk] (val x: Self) extends AnyVal {
      
      inline def setEstree(value: Program): Self = StObject.set(x, "estree", value.asInstanceOf[js.Any])
      
      inline def setEstreeUndefined: Self = StObject.set(x, "estree", js.undefined)
      
      inline def setType(value: ok): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type Point = typings.micromarkUtilTypes.mod.Point
  
  type Program = typings.estree.mod.Program
  
  type State = typings.micromarkUtilTypes.mod.State
  
  type TokenType = typings.micromarkUtilTypes.mod.TokenType
  
  type TokenizeContext = typings.micromarkUtilTypes.mod.TokenizeContext
}
