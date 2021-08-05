package typings.meteor

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.meteor.checkMod.Match.Matcher
import typings.meteor.checkMod.Match.Pattern
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.NumberConstructor
import typings.std.ObjectConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  @JSImport("meteor/check", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object Match {
    
    @JSImport("meteor/check", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/check", "Match.Any")
    @js.native
    def Any: Matcher[js.Any] = js.native
    inline def Any_=(x: Matcher[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Integer")
    @js.native
    def Integer: Matcher[Double] = js.native
    inline def Integer_=(x: Matcher[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    inline def Maybe(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[String] | Null]]]
    inline def Maybe(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Boolean] | Null]]]
    inline def Maybe(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Double] | Null]]]
    inline def Maybe(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Null] | Null]]]
    inline def Maybe(pattern: Unit): Matcher[js.UndefOr[PatternMatch[Unit] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Unit] | Null]]]
    inline def Maybe(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]]]
    inline def Maybe(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]]]
    inline def Maybe(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]]]
    inline def Maybe(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]]]
    inline def Maybe(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]]]
    inline def Maybe[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[js.Any] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Maybe")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[T] | Null]]]
    
    inline def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): Matcher[PatternMatch[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("ObjectIncluding")(dico.asInstanceOf[js.Any]).asInstanceOf[Matcher[PatternMatch[T]]]
    
    inline def OneOf[T /* <: js.Array[Pattern] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
    ): Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("OneOf")(patterns.asInstanceOf[js.Any]).asInstanceOf[Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ]]
    
    inline def Optional(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[String]]]]
    inline def Optional(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Boolean]]]]
    inline def Optional(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Double]]]]
    inline def Optional(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Null]]]]
    inline def Optional(pattern: Unit): Matcher[js.UndefOr[PatternMatch[Unit]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[Unit]]]]
    inline def Optional(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]]]
    inline def Optional(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]]]
    inline def Optional(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[NumberConstructor]]]]
    inline def Optional(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]]]
    inline def Optional(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[StringConstructor]]]]
    inline def Optional[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[js.Any] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("Optional")(pattern.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.UndefOr[PatternMatch[T]]]]
    
    inline def Where(condition: js.Function1[/* val */ js.Any, Boolean]): Matcher[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("Where")(condition.asInstanceOf[js.Any]).asInstanceOf[Matcher[js.Any]]
    
    inline def test(value: js.Any, pattern: String): /* is meteor.meteor/check.Match.PatternMatch<string> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<string> */ Boolean]
    inline def test(value: js.Any, pattern: Boolean): /* is meteor.meteor/check.Match.PatternMatch<boolean> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<boolean> */ Boolean]
    inline def test(value: js.Any, pattern: Double): /* is meteor.meteor/check.Match.PatternMatch<number> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<number> */ Boolean]
    inline def test(value: js.Any, pattern: Null): /* is meteor.meteor/check.Match.PatternMatch<null> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<null> */ Boolean]
    inline def test(value: js.Any, pattern: Unit): /* is meteor.meteor/check.Match.PatternMatch<undefined> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<undefined> */ Boolean]
    inline def test(value: js.Any, pattern: BooleanConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.BooleanConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<std.BooleanConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: FunctionConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.FunctionConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<std.FunctionConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: NumberConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.NumberConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<std.NumberConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: ObjectConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.ObjectConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<std.ObjectConstructor> */ Boolean]
    inline def test(value: js.Any, pattern: StringConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.StringConstructor> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<std.StringConstructor> */ Boolean]
    inline def test[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[js.Any] */](value: js.Any, pattern: T): /* is meteor.meteor/check.Match.PatternMatch<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("test")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* is meteor.meteor/check.Match.PatternMatch<T> */ Boolean]
    
    trait Matcher[T] extends StObject {
      
      var _meteorCheckMatcherBrand: Unit
    }
    object Matcher {
      
      inline def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
        val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Matcher[T]]
      }
      
      extension [Self <: Matcher[?], T](x: Self & Matcher[T]) {
        
        inline def set_meteorCheckMatcherBrand(value: Unit): Self = StObject.set(x, "_meteorCheckMatcherBrand", value.asInstanceOf[js.Any])
      }
    }
    
    type Pattern = js.UndefOr[
        StringConstructor | NumberConstructor | BooleanConstructor | ObjectConstructor | FunctionConstructor | (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | Null | String | Double | Boolean | (js.Array[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
        ]) | (StringDictionary[
          /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.Pattern */ js.Object
        ]) | Matcher[js.Any]
      ]
    
    type PatternMatch[T /* <: Pattern */] = js.Any | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof T ]: / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[K]> * / object}
      */ typings.meteor.meteorStrings.PatternMatch & TopLevel[js.Any]) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> */ js.Object
      ]) | T | js.Function | Boolean | Double | String
  }
  
  inline def check(value: js.Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Null): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: Unit): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: BooleanConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: FunctionConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: NumberConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: ObjectConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean]
  inline def check(value: js.Any, pattern: StringConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean]
  inline def check[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[js.Any] */](value: js.Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("check")(value.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[/* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean]
}
