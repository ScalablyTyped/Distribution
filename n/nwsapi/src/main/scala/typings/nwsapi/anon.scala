package typings.nwsapi

import org.scalablytyped.runtime.StringDictionary
import typings.nwsapi.mod.AttributeOperator
import typings.nwsapi.mod.CustomSelectorResult
import typings.nwsapi.mod.MatcherMode
import typings.nwsapi.nwsapiStrings.$
import typings.nwsapi.nwsapiStrings.^
import typings.nwsapi.nwsapiStrings._empty
import typings.nwsapi.nwsapiStrings.`false`
import typings.nwsapi.nwsapiStrings.`true`
import typings.std.Element
import typings.std.Parameters
import typings.std.RegExpMatchArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'^',   p2 :'$',   p3 :'true'} */
  trait AttributeOperatorp1p2p3tr extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String & ^
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String & $
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1p2p3tr {
    
    inline def apply(p1: String & ^, p2: String & $, p3: (`true` | `false`) & `true`): AttributeOperatorp1p2p3tr = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1p2p3tr]
    }
    
    extension [Self <: AttributeOperatorp1p2p3tr](x: Self) {
      
      inline def setP1(value: String & ^): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String & $): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'^',   p2 :'',   p3 :'true'} */
  trait AttributeOperatorp1p2p3trP1 extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String & ^
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String & _empty
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1p2p3trP1 {
    
    inline def apply(p1: String & ^, p2: String & _empty, p3: (`true` | `false`) & `true`): AttributeOperatorp1p2p3trP1 = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1p2p3trP1]
    }
    
    extension [Self <: AttributeOperatorp1p2p3trP1](x: Self) {
      
      inline def setP1(value: String & ^): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String & _empty): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'^',   p2 :'(-|$)',   p3 :'true'} */
  trait AttributeOperatorp1p2p3trP1P1 extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String & ^
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1p2p3trP1P1 {
    
    inline def apply(p1: String & ^, p2: String, p3: (`true` | `false`) & `true`): AttributeOperatorp1p2p3trP1P1 = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1p2p3trP1P1]
    }
    
    extension [Self <: AttributeOperatorp1p2p3trP1P1](x: Self) {
      
      inline def setP1(value: String & ^): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'',   p2 :'$',   p3 :'true'} */
  trait AttributeOperatorp1p2p3trP2 extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String & _empty
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String & $
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1p2p3trP2 {
    
    inline def apply(p1: String & _empty, p2: String & $, p3: (`true` | `false`) & `true`): AttributeOperatorp1p2p3trP2 = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1p2p3trP2]
    }
    
    extension [Self <: AttributeOperatorp1p2p3trP2](x: Self) {
      
      inline def setP1(value: String & _empty): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String & $): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'',   p2 :'',   p3 :'true'} */
  trait AttributeOperatorp1p2p3trP3 extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String & _empty
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String & _empty
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1p2p3trP3 {
    
    inline def apply(p1: String & _empty, p2: String & _empty, p3: (`true` | `false`) & `true`): AttributeOperatorp1p2p3trP3 = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1p2p3trP3]
    }
    
    extension [Self <: AttributeOperatorp1p2p3trP3](x: Self) {
      
      inline def setP1(value: String & _empty): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String & _empty): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined nwsapi.nwsapi.AttributeOperator & {  p1 :'(^|\s)',   p2 :'(\s|$)',   p3 :'true'} */
  trait AttributeOperatorp1sp2sp3 extends StObject {
    
    /**
      * The RegExp string before the expected attribute value.
      */
    val p1: String
    
    /**
      * The RegExp string after the expected attribute value.
      */
    val p2: String
    
    /**
      * The expected result of the invocation of the RegExp `test` method.
      */
    val p3: (`true` | `false`) & `true`
  }
  object AttributeOperatorp1sp2sp3 {
    
    inline def apply(p1: String, p2: String, p3: (`true` | `false`) & `true`): AttributeOperatorp1sp2sp3 = {
      val __obj = js.Dynamic.literal(p1 = p1.asInstanceOf[js.Any], p2 = p2.asInstanceOf[js.Any], p3 = p3.asInstanceOf[js.Any])
      __obj.asInstanceOf[AttributeOperatorp1sp2sp3]
    }
    
    extension [Self <: AttributeOperatorp1sp2sp3](x: Self) {
      
      inline def setP1(value: String): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      inline def setP2(value: String): Self = StObject.set(x, "p2", value.asInstanceOf[js.Any])
      
      inline def setP3(value: (`true` | `false`) & `true`): Self = StObject.set(x, "p3", value.asInstanceOf[js.Any])
    }
  }
  
  trait Callback[F /* <: js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :string,  readonly Callback :F} */ /* this */ js.Any, 
    /* args */ Parameters[
      js.ThisFunction4[
        /* this */ this.type, 
        /* match */ RegExpMatchArray, 
        /* source */ String, 
        /* mode */ MatcherMode, 
        /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
        CustomSelectorResult
      ]
    ], 
    CustomSelectorResult
  ] */] extends StObject {
    
    val Callback: F
    
    val Expression: String
  }
  object Callback {
    
    inline def apply[F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :string,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](Callback: F, Expression: String): Callback[F] = {
      val __obj = js.Dynamic.literal(Callback = Callback.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[Callback[F]]
    }
    
    extension [Self <: Callback[?], F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :string,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](x: Self & Callback[F]) {
      
      inline def setCallback(value: F): Self = StObject.set(x, "Callback", value.asInstanceOf[js.Any])
      
      inline def setExpression(value: String): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    }
  }
  
  trait CallbackExpression[R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[Symbol.match] : (string : string): std.RegExpMatchArray | null} */ js.Any */, F /* <: js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :R,  readonly Callback :F} */ /* this */ js.Any, 
    /* args */ Parameters[
      js.ThisFunction4[
        /* this */ this.type, 
        /* match */ RegExpMatchArray, 
        /* source */ String, 
        /* mode */ MatcherMode, 
        /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
        CustomSelectorResult
      ]
    ], 
    CustomSelectorResult
  ] */] extends StObject {
    
    val Callback: F
    
    val Expression: R
  }
  object CallbackExpression {
    
    inline def apply[R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[Symbol.match] : (string : string): std.RegExpMatchArray | null} */ js.Any */, F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :R,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](Callback: F, Expression: R): CallbackExpression[R, F] = {
      val __obj = js.Dynamic.literal(Callback = Callback.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackExpression[R, F]]
    }
    
    extension [Self <: CallbackExpression[?, ?], R /* <: /* import warning: importer.ImportType#apply Failed type conversion: {[Symbol.match] : (string : string): std.RegExpMatchArray | null} */ js.Any */, F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :R,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](x: Self & (CallbackExpression[R, F])) {
      
      inline def setCallback(value: F): Self = StObject.set(x, "Callback", value.asInstanceOf[js.Any])
      
      inline def setExpression(value: R): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictoperator
    extends StObject
       with /* operator */ StringDictionary[AttributeOperator] {
    
    @JSName("$=")
    val $Equalssign: AttributeOperatorp1p2p3trP2
    
    @JSName("*=")
    val AsteriskEqualssign: AttributeOperatorp1p2p3trP3
    
    @JSName("=")
    val Equalssign: AttributeOperatorp1p2p3tr
    
    @JSName("~=")
    val TildeEqualssign: AttributeOperatorp1sp2sp3
    
    @JSName("|=")
    val VerticallineEqualssign: AttributeOperatorp1p2p3trP1P1
    
    @JSName("^=")
    val `^Equalssign`: AttributeOperatorp1p2p3trP1
  }
  object Dictoperator {
    
    inline def apply(
      $Equalssign: AttributeOperatorp1p2p3trP2,
      AsteriskEqualssign: AttributeOperatorp1p2p3trP3,
      Equalssign: AttributeOperatorp1p2p3tr,
      TildeEqualssign: AttributeOperatorp1sp2sp3,
      VerticallineEqualssign: AttributeOperatorp1p2p3trP1P1,
      `^Equalssign`: AttributeOperatorp1p2p3trP1
    ): Dictoperator = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("$=")($Equalssign.asInstanceOf[js.Any])
      __obj.updateDynamic("*=")(AsteriskEqualssign.asInstanceOf[js.Any])
      __obj.updateDynamic("=")(Equalssign.asInstanceOf[js.Any])
      __obj.updateDynamic("~=")(TildeEqualssign.asInstanceOf[js.Any])
      __obj.updateDynamic("|=")(VerticallineEqualssign.asInstanceOf[js.Any])
      __obj.updateDynamic("^=")(`^Equalssign`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictoperator]
    }
    
    extension [Self <: Dictoperator](x: Self) {
      
      inline def set$Equalssign(value: AttributeOperatorp1p2p3trP2): Self = StObject.set(x, "$=", value.asInstanceOf[js.Any])
      
      inline def setAsteriskEqualssign(value: AttributeOperatorp1p2p3trP3): Self = StObject.set(x, "*=", value.asInstanceOf[js.Any])
      
      inline def setEqualssign(value: AttributeOperatorp1p2p3tr): Self = StObject.set(x, "=", value.asInstanceOf[js.Any])
      
      inline def setTildeEqualssign(value: AttributeOperatorp1sp2sp3): Self = StObject.set(x, "~=", value.asInstanceOf[js.Any])
      
      inline def setVerticallineEqualssign(value: AttributeOperatorp1p2p3trP1P1): Self = StObject.set(x, "|=", value.asInstanceOf[js.Any])
      
      inline def `set^Equalssign`(value: AttributeOperatorp1p2p3trP1): Self = StObject.set(x, "^=", value.asInstanceOf[js.Any])
    }
  }
  
  trait Expression[F /* <: js.ThisFunction1[
    /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :std.RegExp,  readonly Callback :F} */ /* this */ js.Any, 
    /* args */ Parameters[
      js.ThisFunction4[
        /* this */ this.type, 
        /* match */ RegExpMatchArray, 
        /* source */ String, 
        /* mode */ MatcherMode, 
        /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
        CustomSelectorResult
      ]
    ], 
    CustomSelectorResult
  ] */] extends StObject {
    
    val Callback: F
    
    val Expression: js.RegExp
  }
  object Expression {
    
    inline def apply[F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :std.RegExp,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](Callback: F, Expression: js.RegExp): Expression[F] = {
      val __obj = js.Dynamic.literal(Callback = Callback.asInstanceOf[js.Any], Expression = Expression.asInstanceOf[js.Any])
      __obj.asInstanceOf[Expression[F]]
    }
    
    extension [Self <: Expression[?], F /* <: js.ThisFunction1[
        /* import warning: importer.ImportType#apply Failed type conversion: { readonly Expression :std.RegExp,  readonly Callback :F} */ /* this */ js.Any, 
        /* args */ Parameters[
          js.ThisFunction4[
            /* this */ this.type, 
            /* match */ RegExpMatchArray, 
            /* source */ String, 
            /* mode */ MatcherMode, 
            /* callback */ js.UndefOr[js.Function1[/* element */ Element, Any]], 
            CustomSelectorResult
          ]
        ], 
        CustomSelectorResult
      ] */](x: Self & Expression[F]) {
      
      inline def setCallback(value: F): Self = StObject.set(x, "Callback", value.asInstanceOf[js.Any])
      
      inline def setExpression(value: js.RegExp): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Match extends StObject {
    
    @JSName(js.Symbol.`match`)
    var `match`: js.Function1[/* string */ String, RegExpMatchArray | Null] = js.native
  }
  
  /* Inlined std.Partial<nwsapi.nwsapi.Config> */
  trait PartialConfig extends StObject {
    
    var IDS_DUPES: js.UndefOr[Boolean] = js.undefined
    
    var LOGERRORS: js.UndefOr[Boolean] = js.undefined
    
    var MIXEDCASE: js.UndefOr[Boolean] = js.undefined
    
    var VERBOSITY: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setIDS_DUPES(value: Boolean): Self = StObject.set(x, "IDS_DUPES", value.asInstanceOf[js.Any])
      
      inline def setIDS_DUPESUndefined: Self = StObject.set(x, "IDS_DUPES", js.undefined)
      
      inline def setLOGERRORS(value: Boolean): Self = StObject.set(x, "LOGERRORS", value.asInstanceOf[js.Any])
      
      inline def setLOGERRORSUndefined: Self = StObject.set(x, "LOGERRORS", js.undefined)
      
      inline def setMIXEDCASE(value: Boolean): Self = StObject.set(x, "MIXEDCASE", value.asInstanceOf[js.Any])
      
      inline def setMIXEDCASEUndefined: Self = StObject.set(x, "MIXEDCASE", js.undefined)
      
      inline def setVERBOSITY(value: Boolean): Self = StObject.set(x, "VERBOSITY", value.asInstanceOf[js.Any])
      
      inline def setVERBOSITYUndefined: Self = StObject.set(x, "VERBOSITY", js.undefined)
    }
  }
}
