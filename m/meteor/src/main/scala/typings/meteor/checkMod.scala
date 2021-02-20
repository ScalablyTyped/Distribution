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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkMod {
  
  object Match {
    
    @JSImport("meteor/check", "Match")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("meteor/check", "Match.Any")
    @js.native
    def Any: Matcher[js.Any] = js.native
    @scala.inline
    def Any_=(x: Matcher[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Any")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Integer")
    @js.native
    def Integer: Matcher[Double] = js.native
    @scala.inline
    def Integer_=(x: Matcher[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Integer")(x.asInstanceOf[js.Any])
    
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: js.UndefOr[scala.Nothing]): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: String): Matcher[js.UndefOr[PatternMatch[String] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor] | Null]] = js.native
    @JSImport("meteor/check", "Match.Maybe")
    @js.native
    def Maybe[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T] | Null]] = js.native
    
    @JSImport("meteor/check", "Match.ObjectIncluding")
    @js.native
    def ObjectIncluding[T /* <: StringDictionary[Pattern] */](dico: T): Matcher[PatternMatch[T]] = js.native
    
    @JSImport("meteor/check", "Match.OneOf")
    @js.native
    def OneOf[T /* <: js.Array[Pattern] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param patterns because its type T is not an array type */ patterns: T
    ): Matcher[
        PatternMatch[
          /* import warning: importer.ImportType#apply Failed type conversion: T[number] */ js.Any
        ]
      ] = js.native
    
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: js.UndefOr[scala.Nothing]): Matcher[js.UndefOr[PatternMatch[js.UndefOr[scala.Nothing]]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: String): Matcher[js.UndefOr[PatternMatch[String]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: Boolean): Matcher[js.UndefOr[PatternMatch[Boolean]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: Double): Matcher[js.UndefOr[PatternMatch[Double]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: Null): Matcher[js.UndefOr[PatternMatch[Null]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: BooleanConstructor): Matcher[js.UndefOr[PatternMatch[BooleanConstructor]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: FunctionConstructor): Matcher[js.UndefOr[PatternMatch[FunctionConstructor]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: NumberConstructor): Matcher[js.UndefOr[PatternMatch[NumberConstructor]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: ObjectConstructor): Matcher[js.UndefOr[PatternMatch[ObjectConstructor]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional(pattern: StringConstructor): Matcher[js.UndefOr[PatternMatch[StringConstructor]]] = js.native
    @JSImport("meteor/check", "Match.Optional")
    @js.native
    def Optional[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](pattern: T): Matcher[js.UndefOr[PatternMatch[T]]] = js.native
    
    @JSImport("meteor/check", "Match.Where")
    @js.native
    def Where(condition: js.Function1[/* val */ js.Any, Boolean]): Matcher[_] = js.native
    
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: js.UndefOr[scala.Nothing]): /* is meteor.meteor/check.Match.PatternMatch<undefined> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: String): /* is meteor.meteor/check.Match.PatternMatch<string> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: Boolean): /* is meteor.meteor/check.Match.PatternMatch<boolean> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: Double): /* is meteor.meteor/check.Match.PatternMatch<number> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: Null): /* is meteor.meteor/check.Match.PatternMatch<null> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: BooleanConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.BooleanConstructor> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: FunctionConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.FunctionConstructor> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: NumberConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.NumberConstructor> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: ObjectConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.ObjectConstructor> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test(value: js.Any, pattern: StringConstructor): /* is meteor.meteor/check.Match.PatternMatch<std.StringConstructor> */ Boolean = js.native
    @JSImport("meteor/check", "Match.test")
    @js.native
    def test[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* is meteor.meteor/check.Match.PatternMatch<T> */ Boolean = js.native
    
    @js.native
    trait Matcher[T] extends StObject {
      
      var _meteorCheckMatcherBrand: Unit = js.native
    }
    object Matcher {
      
      @scala.inline
      def apply[T](_meteorCheckMatcherBrand: Unit): Matcher[T] = {
        val __obj = js.Dynamic.literal(_meteorCheckMatcherBrand = _meteorCheckMatcherBrand.asInstanceOf[js.Any])
        __obj.asInstanceOf[Matcher[T]]
      }
      
      @scala.inline
      implicit class MatcherMutableBuilder[Self <: Matcher[_], T] (val x: Self with Matcher[T]) extends AnyVal {
        
        @scala.inline
        def set_meteorCheckMatcherBrand(value: Unit): Self = StObject.set(x, "_meteorCheckMatcherBrand", value.asInstanceOf[js.Any])
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
      */ typings.meteor.meteorStrings.PatternMatch with TopLevel[js.Any]) | (js.Array[
        /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias meteor.meteor/check.Match.PatternMatch<T[0]> */ js.Object
      ]) | T | js.Function | Boolean | Double | String
  }
  
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: js.UndefOr[scala.Nothing]): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(undefined))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: String): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(string))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: Boolean): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(boolean))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: Double): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(number))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: Null): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(null))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: BooleanConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(BooleanConstructor))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: FunctionConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(FunctionConstructor))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: NumberConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(NumberConstructor))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: ObjectConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(ObjectConstructor))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check(value: js.Any, pattern: StringConstructor): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(std), TsIdentSimple(StringConstructor))),IArray())))*/ Boolean = js.native
  @JSImport("meteor/check", "check")
  @js.native
  def check[T /* <: (Instantiable1[/* args (repeated) */ js.Any, js.Any]) | js.Array[Pattern] | StringDictionary[Pattern] | Matcher[_] */](value: js.Any, pattern: T): /* asserts value is TsTypeRef(NoComments,TsQIdent(IArray(TsIdentLibrarySimple(meteor), TsIdentModule(None,List(meteor, check)), TsIdentSimple(Match), TsIdentSimple(PatternMatch))),IArray(TsTypeRef(NoComments,TsQIdent(IArray(TsIdentSimple(T))),IArray())))*/ Boolean = js.native
}
