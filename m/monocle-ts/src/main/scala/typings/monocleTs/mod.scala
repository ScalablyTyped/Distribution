package typings.monocleTs

import org.scalablytyped.runtime.TopLevel
import typings.fpTs.applicativeMod.Applicative
import typings.fpTs.applicativeMod.Applicative1
import typings.fpTs.applicativeMod.Applicative2
import typings.fpTs.applicativeMod.Applicative2C
import typings.fpTs.applicativeMod.Applicative3
import typings.fpTs.categoryMod.Category2
import typings.fpTs.eitherMod.Either_
import typings.fpTs.eqMod.Eq
import typings.fpTs.foldableMod.Foldable
import typings.fpTs.foldableMod.Foldable1
import typings.fpTs.foldableMod.Foldable2
import typings.fpTs.foldableMod.Foldable3
import typings.fpTs.functionMod.Predicate
import typings.fpTs.functionMod.Refinement
import typings.fpTs.functorMod.Functor
import typings.fpTs.functorMod.Functor1
import typings.fpTs.functorMod.Functor2
import typings.fpTs.functorMod.Functor3
import typings.fpTs.invariantMod.Invariant2
import typings.fpTs.monoidMod.Monoid
import typings.fpTs.optionMod.Option_
import typings.fpTs.readonlyNonEmptyArrayMod.ReadonlyNonEmptyArray_
import typings.fpTs.readonlyRecordMod.ReadonlyRecord_
import typings.fpTs.semigroupoidMod.Semigroupoid2
import typings.fpTs.traversableMod.Traversable
import typings.fpTs.traversableMod.Traversable1
import typings.fpTs.traversableMod.Traversable2
import typings.fpTs.traversableMod.Traversable3
import typings.monocleTs.monocleTsStrings.At
import typings.monocleTs.monocleTsStrings.Index
import typings.monocleTs.monocleTsStrings.Iso
import typings.monocleTs.monocleTsStrings.Lens
import typings.monocleTs.monocleTsStrings.Optional
import typings.monocleTs.monocleTsStrings.Prism
import typings.monocleTs.monocleTsStrings.Traversal
import typings.std.NonNullable
import typings.std.ReadonlyMap
import typings.std.ReadonlySet
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("monocle-ts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("monocle-ts", "At")
  @js.native
  open class At_[S, I, A] protected () extends StObject {
    def this(at: js.Function1[/* i */ I, Lens_[S, A]]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: At = js.native
    
    def at(i: I): Lens_[S, A] = js.native
    
    /**
      * lift an instance of `At` using an `Iso`
      *
      * @since 1.2.0
      */
    def fromIso[T](iso: Iso_[T, S]): At_[T, I, A] = js.native
  }
  
  @JSImport("monocle-ts", "Fold")
  @js.native
  open class Fold[S, A] protected () extends StObject {
    /* private */ def this(foldMap: js.Function1[
            /* M */ Monoid[Any], 
            js.Function1[/* f */ js.Function1[/* a */ A, Any], js.Function1[/* s */ S, Any]]
          ]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: typings.monocleTs.monocleTsStrings.Fold = js.native
    
    /**
      * check if all targets satisfy the predicate
      *
      * @since 1.0.0
      */
    def all(p: Predicate[A]): Predicate[S] = js.native
    
    /**
      * compose a `Fold` with a `Fold`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Fold` with a `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Fold[S, B] = js.native
    
    /**
      * check if at least one target satisfies the predicate
      *
      * @since 1.0.0
      */
    def exist(p: Predicate[A]): Predicate[S] = js.native
    
    def find(p: Predicate[A]): js.Function1[/* s */ S, Option_[A]] = js.native
    /**
      * find the first target of a `Fold` matching the predicate
      *
      * @since 1.0.0
      */
    @JSName("find")
    def find_B[B /* <: A */](p: Refinement[A, B]): js.Function1[/* s */ S, Option_[B]] = js.native
    
    def foldMap[M](M: Monoid[M]): js.Function1[/* f */ js.Function1[/* a */ A, M], js.Function1[/* s */ S, M]] = js.native
    
    /**
      * get all the targets of a `Fold`
      *
      * @since 1.0.0
      */
    def getAll(s: S): js.Array[A] = js.native
    
    /**
      * get the first target of a `Fold`
      *
      * @since 1.0.0
      */
    def headOption(s: S): Option_[A] = js.native
  }
  
  @JSImport("monocle-ts", "Getter")
  @js.native
  open class Getter[S, A] protected () extends StObject {
    def this(get: js.Function1[/* s */ S, A]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: typings.monocleTs.monocleTsStrings.Getter = js.native
    
    /**
      * view a `Getter` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * compose a `Getter` with a `Getter`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Getter[A, B]): Getter[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Getter[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Getter[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Getter` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Fold[S, B] = js.native
    
    def get(s: S): A = js.native
  }
  
  @JSImport("monocle-ts", "Index")
  @js.native
  open class Index_[S, I, A] protected () extends StObject {
    def this(index: js.Function1[/* i */ I, Optional_[S, A]]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Index = js.native
    
    /**
      * lift an instance of `Index` using an `Iso`
      *
      * @since 1.2.0
      */
    def fromIso[T](iso: Iso_[T, S]): Index_[T, I, A] = js.native
    
    def index(i: I): Optional_[S, A] = js.native
  }
  /* static members */
  object Index_ {
    
    @JSImport("monocle-ts", "Index")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @since 1.2.0
      */
    inline def fromAt[T, J, B](at: At_[T, J, Option_[B]]): Index_[T, J, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAt")(at.asInstanceOf[js.Any]).asInstanceOf[Index_[T, J, B]]
  }
  
  @JSImport("monocle-ts", "Iso")
  @js.native
  open class Iso_[S, A] protected () extends StObject {
    def this(get: js.Function1[/* s */ S, A], reverseGet: js.Function1[/* a */ A, S]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Iso = js.native
    
    /**
      * view an `Iso` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * view an `Iso` as a `Getter`
      *
      * @since 1.0.0
      */
    def asGetter(): Getter[S, A] = js.native
    
    /**
      * view an `Iso` as a `Lens`
      *
      * @since 1.0.0
      */
    def asLens(): Lens_[S, A] = js.native
    
    /**
      * view an `Iso` as a `Optional`
      *
      * @since 1.0.0
      */
    def asOptional(): Optional_[S, A] = js.native
    
    /**
      * view an `Iso` as a `Prism`
      *
      * @since 1.0.0
      */
    def asPrism(): Prism_[S, A] = js.native
    
    /**
      * view an `Iso` as a `Setter`
      *
      * @since 1.0.0
      */
    def asSetter(): Setter[S, A] = js.native
    
    /**
      * view an `Iso` as a `Traversal`
      *
      * @since 1.0.0
      */
    def asTraversal(): Traversal_[S, A] = js.native
    
    /**
      * compose an `Iso` with an `Iso`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Iso_[A, B]): Iso_[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Iso_[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Lens `
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Lens_[S, B] = js.native
    
    /**
      * compose an `Iso` with an `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Prism_[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Setter`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose an `Iso` with a `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * @since 1.0.0
      */
    def from(a: A): S = js.native
    
    def get(s: S): A = js.native
    
    /**
      * @since 1.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    /**
      * reverse the `Iso`: the source becomes the target and the target becomes the source
      * @since 1.0.0
      */
    def reverse(): Iso_[A, S] = js.native
    
    def reverseGet(a: A): S = js.native
    
    /**
      * @since 1.0.0
      */
    def to(s: S): A = js.native
    
    /**
      * @since 1.0.0
      */
    def unwrap(s: S): A = js.native
    
    /**
      * @since 1.0.0
      */
    def wrap(a: A): S = js.native
  }
  
  @JSImport("monocle-ts", "Lens")
  @js.native
  open class Lens_[S, A] protected () extends StObject {
    def this(get: js.Function1[/* s */ S, A], set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Lens = js.native
    
    /**
      * view a `Lens` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * view a `Lens` as a `Getter`
      *
      * @since 1.0.0
      */
    def asGetter(): Getter[S, A] = js.native
    
    /**
      * view a `Lens` as a Optional
      *
      * @since 1.0.0
      */
    def asOptional(): Optional_[S, A] = js.native
    
    /**
      * view a `Lens` as a `Setter`
      *
      * @since 1.0.0
      */
    def asSetter(): Setter[S, A] = js.native
    
    /**
      * view a `Lens` as a `Traversal`
      *
      * @since 1.0.0
      */
    def asTraversal(): Traversal_[S, A] = js.native
    
    /**
      * compose a `Lens` with a `Lens`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Lens_[A, B]): Lens_[S, B] = js.native
    
    /**
      * compose a `Lens` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Lens` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
    
    /**
      * compose a `Lens` with an `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Lens_[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Lens_[S, B] = js.native
    
    /**
      * compose a `Lens` with an `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose a `Lens` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose a `Lens` with an `Setter`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Lens` with an `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    def get(s: S): A = js.native
    
    /**
      * @since 1.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    def set(a: A): js.Function1[/* s */ S, S] = js.native
  }
  /* static members */
  object Lens_ {
    
    @JSImport("monocle-ts", "Lens")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns a `Lens` from a nullable (`A | null | undefined`) prop
      *
      * @example
      * import { Lens } from 'monocle-ts'
      *
      * interface Outer {
      *   inner?: Inner
      * }
      *
      * interface Inner {
      *   value: number
      *   foo: string
      * }
      *
      * const inner = Lens.fromNullableProp<Outer>()('inner', { value: 0, foo: 'foo' })
      * const value = Lens.fromProp<Inner>()('value')
      * const lens = inner.compose(value)
      *
      * assert.deepStrictEqual(lens.set(1)({}), { inner: { value: 1, foo: 'foo' } })
      * assert.strictEqual(lens.get({}), 0)
      * assert.deepStrictEqual(lens.set(1)({ inner: { value: 1, foo: 'bar' } }), { inner: { value: 1, foo: 'bar' } })
      * assert.strictEqual(lens.get({ inner: { value: 1, foo: 'bar' } }), 1)
      *
      * @since 1.0.0
      */
    inline def fromNullableProp[S](): js.Function2[
        /* keyof S */ /* k */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ /* defaultValue */ js.Any, 
        Lens_[
          S, 
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableProp")().asInstanceOf[js.Function2[
        /* keyof S */ /* k */ String, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ /* defaultValue */ js.Any, 
        Lens_[
          S, 
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
          ]
        ]
      ]]
    
    /**
      * @example
      * import { Lens } from 'monocle-ts'
      *
      * type Person = {
      *   name: string
      *   age: number
      *   address: {
      *     city: string
      *   }
      * }
      *
      * const city = Lens.fromPath<Person>()(['address', 'city'])
      *
      * const person: Person = { name: 'Giulio', age: 43, address: { city: 'Milan' } }
      *
      * assert.strictEqual(city.get(person), 'Milan')
      * assert.deepStrictEqual(city.set('London')(person), { name: 'Giulio', age: 43, address: { city: 'London' } })
      *
      * @since 1.0.0
      */
    inline def fromPath[S](): LensFromPath[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")().asInstanceOf[LensFromPath[S]]
    
    /**
      * Returns a `Lens` from a type and a prop
      *
      * @example
      * import { Lens } from 'monocle-ts'
      *
      * type Person = {
      *   name: string
      *   age: number
      * }
      *
      * const age = Lens.fromProp<Person>()('age')
      *
      * const person: Person = { name: 'Giulio', age: 43 }
      *
      * assert.strictEqual(age.get(person), 43)
      * assert.deepStrictEqual(age.set(44)(person), { name: 'Giulio', age: 44 })
      *
      * @since 1.0.0
      */
    inline def fromProp[S](): js.Function1[
        /* keyof S */ /* prop */ String, 
        Lens_[
          S, 
          /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProp")().asInstanceOf[js.Function1[
        /* keyof S */ /* prop */ String, 
        Lens_[
          S, 
          /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
        ]
      ]]
    
    /**
      * Returns a `Lens` from a type and an array of props
      *
      * @example
      * import { Lens } from 'monocle-ts'
      *
      * interface Person {
      *   name: string
      *   age: number
      *   rememberMe: boolean
      * }
      *
      * const lens = Lens.fromProps<Person>()(['name', 'age'])
      *
      * const person: Person = { name: 'Giulio', age: 44, rememberMe: true }
      *
      * assert.deepStrictEqual(lens.get(person), { name: 'Giulio', age: 44 })
      * assert.deepStrictEqual(lens.set({ name: 'Guido', age: 47 })(person), { name: 'Guido', age: 47, rememberMe: true })
      *
      * @since 1.0.0
      */
    inline def fromProps[S](): js.Function1[
        /* props */ js.Array[/* keyof S */ String], 
        Lens_[
          S, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof S ]: S[K]}
      */ typings.monocleTs.monocleTsStrings.fromProps & TopLevel[S]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromProps")().asInstanceOf[js.Function1[
        /* props */ js.Array[/* keyof S */ String], 
        Lens_[
          S, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof S ]: S[K]}
      */ typings.monocleTs.monocleTsStrings.fromProps & TopLevel[S]
        ]
      ]]
  }
  
  @JSImport("monocle-ts", "Optional")
  @js.native
  open class Optional_[S, A] protected () extends StObject {
    def this(
      getOption: js.Function1[/* s */ S, Option_[A]],
      set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]
    ) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Optional = js.native
    
    /**
      * view an `Optional` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * view an `Optional` as a `Setter`
      *
      * @since 1.0.0
      */
    def asSetter(): Setter[S, A] = js.native
    
    /**
      * view a `Optional` as a `Traversal`
      *
      * @since 1.0.0
      */
    def asTraversal(): Traversal_[S, A] = js.native
    
    /**
      * compose a `Optional` with a `Optional`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Optional_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Optional_[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Setter`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose an `Optional` with a `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    def getOption(s: S): Option_[A] = js.native
    
    /**
      * @since 1.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    /**
      * @since 1.0.0
      */
    def modifyOption(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, Option_[S]] = js.native
    
    def set(a: A): js.Function1[/* s */ S, S] = js.native
  }
  /* static members */
  object Optional_ {
    
    @JSImport("monocle-ts", "Optional")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * @example
      * import { Optional } from 'monocle-ts'
      *
      * interface S {
      *   a: number | undefined | null
      * }
      *
      * const optional = Optional.fromNullableProp<S>()('a')
      *
      * const s1: S = { a: undefined }
      * const s2: S = { a: null }
      * const s3: S = { a: 1 }
      *
      * assert.deepStrictEqual(optional.set(2)(s1), s1)
      * assert.deepStrictEqual(optional.set(2)(s2), s2)
      * assert.deepStrictEqual(optional.set(2)(s3), { a: 2 })
      *
      * @since 1.0.0
      */
    inline def fromNullableProp[S](): js.Function1[
        /* keyof S */ /* k */ String, 
        Optional_[
          S, 
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullableProp")().asInstanceOf[js.Function1[
        /* keyof S */ /* k */ String, 
        Optional_[
          S, 
          NonNullable[
            /* import warning: importer.ImportType#apply Failed type conversion: S[keyof S] */ js.Any
          ]
        ]
      ]]
    
    /**
      * Returns an `Optional` from an option (`Option<A>`) prop
      *
      * @example
      * import { Optional } from 'monocle-ts'
      * import * as O from 'fp-ts/Option'
      *
      * interface S {
      *   a: O.Option<number>
      * }
      *
      * const optional = Optional.fromOptionProp<S>()('a')
      * const s1: S = { a: O.none }
      * const s2: S = { a: O.some(1) }
      * assert.deepStrictEqual(optional.set(2)(s1), s1)
      * assert.deepStrictEqual(optional.set(2)(s2), { a: O.some(2) })
      *
      * @since 1.0.0
      */
    inline def fromOptionProp[S](): js.Function1[
        /* prop */ OptionPropertyNames[S], 
        Optional_[S, OptionPropertyType[S, OptionPropertyNames[S]]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromOptionProp")().asInstanceOf[js.Function1[
        /* prop */ OptionPropertyNames[S], 
        Optional_[S, OptionPropertyType[S, OptionPropertyNames[S]]]
      ]]
    
    /**
      * Returns an `Optional` from a nullable (`A | null | undefined`) prop
      *
      * @example
      * import { Optional } from 'monocle-ts'
      *
      * interface Phone {
      *   number: string
      * }
      * interface Employment {
      *   phone?: Phone
      * }
      * interface Info {
      *   employment?: Employment
      * }
      * interface Response {
      *   info?: Info
      * }
      *
      * const numberFromResponse = Optional.fromPath<Response>()(['info', 'employment', 'phone', 'number'])
      *
      * const response1: Response = {
      *   info: {
      *     employment: {
      *       phone: {
      *         number: '555-1234'
      *       }
      *     }
      *   }
      * }
      * const response2: Response = {
      *   info: {
      *     employment: {}
      *   }
      * }
      *
      * numberFromResponse.getOption(response1) // some('555-1234')
      * numberFromResponse.getOption(response2) // none
      *
      * @since 2.1.0
      */
    inline def fromPath[S](): OptionalFromPath[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPath")().asInstanceOf[OptionalFromPath[S]]
  }
  
  @JSImport("monocle-ts", "Prism")
  @js.native
  open class Prism_[S, A] protected () extends StObject {
    def this(getOption: js.Function1[/* s */ S, Option_[A]], reverseGet: js.Function1[/* a */ A, S]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Prism = js.native
    
    /**
      * view a `Prism` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * view a `Prism` as a `Optional`
      *
      * @since 1.0.0
      */
    def asOptional(): Optional_[S, A] = js.native
    
    /**
      * view a `Prism` as a `Setter`
      *
      * @since 1.0.0
      */
    def asSetter(): Setter[S, A] = js.native
    
    /**
      * view a `Prism` as a `Traversal`
      *
      * @since 1.0.0
      */
    def asTraversal(): Traversal_[S, A] = js.native
    
    /**
      * compose a `Prism` with a `Prism`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Prism_[A, B]): Prism_[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Prism_[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Optional_[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Optional_[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Prism_[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Setter`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Prism` with a `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    def getOption(s: S): Option_[A] = js.native
    
    /**
      * @since 1.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    /**
      * @since 1.0.0
      */
    def modifyOption(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, Option_[S]] = js.native
    
    def reverseGet(a: A): S = js.native
    
    /**
      * set the target of a `Prism` with a value
      *
      * @since 1.0.0
      */
    def set(a: A): js.Function1[/* s */ S, S] = js.native
  }
  /* static members */
  object Prism_ {
    
    @JSImport("monocle-ts", "Prism")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromPredicate[A](predicate: Predicate[A]): Prism_[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[Prism_[A, A]]
    
    /**
      * @since 1.0.0
      */
    inline def fromPredicate_SA[S, A /* <: S */](refinement: Refinement[S, A]): Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[Prism_[S, A]]
    
    /**
      * @since 1.0.0
      */
    inline def some[A](): Prism_[Option_[A], A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")().asInstanceOf[Prism_[Option_[A], A]]
  }
  
  @JSImport("monocle-ts", "Setter")
  @js.native
  open class Setter[S, A] protected () extends StObject {
    def this(modify: js.Function1[/* f */ js.Function1[/* a */ A, A], js.Function1[/* s */ S, S]]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: typings.monocleTs.monocleTsStrings.Setter = js.native
    
    /**
      * compose a `Setter` with a `Setter`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Setter` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Setter` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Setter` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Setter` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Setter[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * compose a `Setter` with a `Traversal`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Setter[S, B] = js.native
    
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    /**
      * @since 1.0.0
      */
    def set(a: A): js.Function1[/* s */ S, S] = js.native
  }
  
  @JSImport("monocle-ts", "Traversal")
  @js.native
  open class Traversal_[S, A] protected () extends StObject {
    def this(modifyF: ModifyF[S, A]) = this()
    
    /**
      * @since 1.0.0
      */
    val _tag: Traversal = js.native
    
    /**
      * view a `Traversal` as a `Fold`
      *
      * @since 1.0.0
      */
    def asFold(): Fold[S, A] = js.native
    
    /**
      * view a `Traversal` as a `Setter`
      *
      * @since 1.0.0
      */
    def asSetter(): Setter[S, A] = js.native
    
    /**
      * compose a `Traversal` with a `Traversal`
      *
      * @since 1.0.0
      */
    def compose[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Fold`
      *
      * @since 1.0.0
      */
    def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Getter`
      *
      * @since 1.0.0
      */
    def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Iso`
      *
      * @since 1.0.0
      */
    def composeIso[B](ab: Iso_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Lens`
      *
      * @since 1.0.0
      */
    def composeLens[B](ab: Lens_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Optional`
      *
      * @since 1.0.0
      */
    def composeOptional[B](ab: Optional_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Prism`
      *
      * @since 1.0.0
      */
    def composePrism[B](ab: Prism_[A, B]): Traversal_[S, B] = js.native
    
    /**
      * compose a `Traversal` with a `Setter`
      *
      * @since 1.0.0
      */
    def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
    
    /**
      * Alias of `compose`
      *
      * @since 1.0.0
      */
    def composeTraversal[B](ab: Traversal_[A, B]): Traversal_[S, B] = js.native
    
    def filter(predicate: Predicate[A]): Traversal_[S, A] = js.native
    /**
      * focus the items matched by a `traversal` to those that match a predicate
      *
      * @example
      * import { fromTraversable, Lens } from 'monocle-ts'
      * import { Traversable } from 'fp-ts/Array'
      *
      * interface Person {
      *   name: string;
      *   cool: boolean;
      * }
      *
      * const peopleTraversal = fromTraversable(Traversable)<Person>()
      * const coolLens = Lens.fromProp<Person>()('cool')
      * const people = [{name: 'bill', cool: false}, {name: 'jill', cool: true}]
      *
      * const actual = peopleTraversal.filter(p => p.name === 'bill').composeLens(coolLens)
      *   .set(true)(people)
      *
      * assert.deepStrictEqual(actual, [{name: 'bill', cool: true}, {name: 'jill', cool: true}])
      *
      * @since 1.0.0
      */
    @JSName("filter")
    def filter_B[B /* <: A */](refinement: Refinement[A, B]): Traversal_[S, B] = js.native
    
    /**
      * @since 1.0.0
      */
    def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
    
    def modifyF[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
        ]
      ] = js.native
    def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */, E](F: Applicative2C[F, E]): js.Function1[
        /* f */ js.Function1[
          /* a */ A, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* s */ S, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
        ]
      ] = js.native
    
    /**
      * @since 1.0.0
      */
    def set(a: A): js.Function1[/* s */ S, S] = js.native
  }
  
  object at {
    
    @JSImport("monocle-ts", "at")
    @js.native
    val ^ : js.Any = js.native
    inline def at[S, I, A](at: js.Function1[/* i */ I, typings.monocleTs.lensMod.Lens_[S, A]]): typings.monocleTs.atMod.At_[S, I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("at")(at.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.atMod.At_[S, I, A]]
    
    inline def atReadonlyMap[K](E: Eq[K]): js.Function0[
        typings.monocleTs.atMod.At_[ReadonlyMap[K, scala.Nothing], K, Option_[scala.Nothing]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
        typings.monocleTs.atMod.At_[ReadonlyMap[K, scala.Nothing], K, Option_[scala.Nothing]]
      ]]
    
    inline def atReadonlyRecord[A](): typings.monocleTs.atMod.At_[ReadonlyRecord_[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlyRecord")().asInstanceOf[typings.monocleTs.atMod.At_[ReadonlyRecord_[String, A], String, Option_[A]]]
    
    inline def atReadonlySet[A](E: Eq[A]): typings.monocleTs.atMod.At_[ReadonlySet[A], A, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("atReadonlySet")(E.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.atMod.At_[ReadonlySet[A], A, Boolean]]
    
    inline def atRecord[A](): typings.monocleTs.atMod.At_[ReadonlyRecord_[String, A], String, Option_[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("atRecord")().asInstanceOf[typings.monocleTs.atMod.At_[ReadonlyRecord_[String, A], String, Option_[A]]]
    
    inline def fromIso[T, S](iso: typings.monocleTs.isoMod.Iso_[T, S]): js.Function1[
        /* sia */ typings.monocleTs.atMod.At_[S, Any, Any], 
        typings.monocleTs.atMod.At_[T, Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sia */ typings.monocleTs.atMod.At_[S, Any, Any], 
        typings.monocleTs.atMod.At_[T, Any, Any]
      ]]
  }
  
  inline def fromFoldable[F](F: Foldable[F]): js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any, 
      Any
    ]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Foldable1[F]): js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any, 
      Any
    ]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Foldable2[F]): js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, L, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, L, A> */ Any, 
      Any
    ]
  ]]
  inline def fromFoldable[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Foldable3[F]): js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, U, L, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFoldable")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Fold[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, U, L, A> */ Any, 
      Any
    ]
  ]]
  
  inline def fromTraversable[T](T: Traversable[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](T: Traversable2[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, L, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, L, A> */ Any, 
      Any
    ]
  ]]
  inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](T: Traversable3[T]): js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, U, L, A> */ Any, 
      Any
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
    Traversal_[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, U, L, A> */ Any, 
      Any
    ]
  ]]
  
  object index {
    
    @JSImport("monocle-ts", "index")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromAt[T, J, B](at: typings.monocleTs.atMod.At_[T, J, Option_[B]]): typings.monocleTs.ixMod.Index_[T, J, B] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAt")(at.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.ixMod.Index_[T, J, B]]
    
    inline def fromIso[T, S](iso: typings.monocleTs.isoMod.Iso_[T, S]): js.Function1[
        /* sia */ typings.monocleTs.ixMod.Index_[S, Any, Any], 
        typings.monocleTs.ixMod.Index_[T, Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIso")(iso.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sia */ typings.monocleTs.ixMod.Index_[S, Any, Any], 
        typings.monocleTs.ixMod.Index_[T, Any, Any]
      ]]
    
    inline def index[S, I, A](index: js.Function1[/* i */ I, typings.monocleTs.optionalMod.Optional_[S, A]]): typings.monocleTs.ixMod.Index_[S, I, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(index.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.ixMod.Index_[S, I, A]]
    
    inline def indexArray[A](): typings.monocleTs.ixMod.Index_[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexArray")().asInstanceOf[typings.monocleTs.ixMod.Index_[js.Array[A], Double, A]]
    
    inline def indexReadonlyArray[A](): typings.monocleTs.ixMod.Index_[js.Array[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyArray")().asInstanceOf[typings.monocleTs.ixMod.Index_[js.Array[A], Double, A]]
    
    inline def indexReadonlyMap[K](E: Eq[K]): js.Function0[typings.monocleTs.ixMod.Index_[ReadonlyMap[K, scala.Nothing], K, scala.Nothing]] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyMap")(E.asInstanceOf[js.Any]).asInstanceOf[js.Function0[typings.monocleTs.ixMod.Index_[ReadonlyMap[K, scala.Nothing], K, scala.Nothing]]]
    
    inline def indexReadonlyNonEmptyArray[A](): typings.monocleTs.ixMod.Index_[ReadonlyNonEmptyArray_[A], Double, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyNonEmptyArray")().asInstanceOf[typings.monocleTs.ixMod.Index_[ReadonlyNonEmptyArray_[A], Double, A]]
    
    inline def indexReadonlyRecord[A](): typings.monocleTs.ixMod.Index_[ReadonlyRecord_[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexReadonlyRecord")().asInstanceOf[typings.monocleTs.ixMod.Index_[ReadonlyRecord_[String, A], String, A]]
    
    inline def indexRecord[A](): typings.monocleTs.ixMod.Index_[ReadonlyRecord_[String, A], String, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexRecord")().asInstanceOf[typings.monocleTs.ixMod.Index_[ReadonlyRecord_[String, A], String, A]]
  }
  
  object iso {
    
    @JSImport("monocle-ts", "iso")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("monocle-ts", "iso.Category")
    @js.native
    val Category: Category2[typings.monocleTs.isoMod.URI] = js.native
    
    @JSImport("monocle-ts", "iso.Invariant")
    @js.native
    val Invariant: Invariant2[typings.monocleTs.isoMod.URI] = js.native
    
    @JSImport("monocle-ts", "iso.Semigroupoid")
    @js.native
    val Semigroupoid: Semigroupoid2[typings.monocleTs.isoMod.URI] = js.native
    
    @JSImport("monocle-ts", "iso.URI")
    @js.native
    val URI: /* "monocle-ts/Iso" */ String = js.native
    
    inline def asLens[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.lensMod.Lens_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asLens")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.lensMod.Lens_[S, A]]
    
    inline def asOptional[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def asPrism[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asPrism")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def asTraversal[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def atKey(key: String): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, Record[String, Any]], 
        typings.monocleTs.lensMod.Lens_[Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, Record[String, Any]], 
        typings.monocleTs.lensMod.Lens_[Any, Option_[Any]]
      ]]
    
    inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def compose[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ]]
    
    inline def composeIso[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ]]
    
    inline def composeLens[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ]]
    
    inline def composeOptional[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composePrism[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def composeTraversal[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def filter[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, A]
      ]]
    
    inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def findFirst[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def fromNullable[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.prismMod.Prism_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, NonNullable[A]]]
    
    inline def id[S](): typings.monocleTs.isoMod.Iso_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.monocleTs.isoMod.Iso_[S, S]]
    
    inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.isoMod.Iso_[Any, B]
      ]]
    
    inline def index(i: Double): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def indexNonEmpty(i: Double): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def iso[S, A](get: js.Function1[/* s */ S, A], reverseGet: js.Function1[/* a */ A, S]): typings.monocleTs.isoMod.Iso_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("iso")(get.asInstanceOf[js.Any], reverseGet.asInstanceOf[js.Any])).asInstanceOf[typings.monocleTs.isoMod.Iso_[S, A]]
    
    inline def key(key: String): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def left[S, E, A](sea: typings.monocleTs.isoMod.Iso_[S, Either_[E, A]]): typings.monocleTs.prismMod.Prism_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, E]]
    
    inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ typings.monocleTs.isoMod.Iso_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ typings.monocleTs.isoMod.Iso_[Any, A], js.Function1[/* s */ Any, Any]]]
    
    inline def modifyF[F](F: Functor[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.isoMod.Iso_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ]]
    
    inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.isoMod.Iso_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ]]
    
    inline def reverse[S, A](sa: typings.monocleTs.isoMod.Iso_[S, A]): typings.monocleTs.isoMod.Iso_[A, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.isoMod.Iso_[A, S]]
    
    inline def right[S, E, A](sea: typings.monocleTs.isoMod.Iso_[S, Either_[E, A]]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def some[S, A](soa: typings.monocleTs.isoMod.Iso_[S, Option_[A]]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
        /* sta */ typings.monocleTs.isoMod.Iso_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sta */ typings.monocleTs.isoMod.Iso_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    /* augmented module */
    object fpTsLibHKTAugmentingMod {
      
      @js.native
      trait URItoKind2[E, A] extends StObject
    }
  }
  
  object lens {
    
    @JSImport("monocle-ts", "lens")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("monocle-ts", "lens.Category")
    @js.native
    val Category: Category2[typings.monocleTs.lensMod.URI] = js.native
    
    @JSImport("monocle-ts", "lens.Invariant")
    @js.native
    val Invariant: Invariant2[typings.monocleTs.lensMod.URI] = js.native
    
    @JSImport("monocle-ts", "lens.Semigroupoid")
    @js.native
    val Semigroupoid: Semigroupoid2[typings.monocleTs.lensMod.URI] = js.native
    
    @JSImport("monocle-ts", "lens.URI")
    @js.native
    val URI: /* "monocle-ts/Lens" */ String = js.native
    
    inline def asOptional[S, A](sa: typings.monocleTs.lensMod.Lens_[S, A]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def asTraversal[S, A](sa: typings.monocleTs.lensMod.Lens_[S, A]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def atKey(key: String): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyRecord_[String, Any]], 
        typings.monocleTs.lensMod.Lens_[Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyRecord_[String, Any]], 
        typings.monocleTs.lensMod.Lens_[Any, Option_[Any]]
      ]]
    
    inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def compose[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ]]
    
    inline def composeIso[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ]]
    
    inline def composeLens[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ]]
    
    inline def composeOptional[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composePrism[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeTraversal[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def filter[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def fromNullable[S, A](sa: typings.monocleTs.lensMod.Lens_[S, A]): typings.monocleTs.optionalMod.Optional_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, NonNullable[A]]]
    
    inline def id[S](): typings.monocleTs.lensMod.Lens_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.monocleTs.lensMod.Lens_[S, S]]
    
    inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[Any, B]
      ]]
    
    inline def index(i: Double): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def indexNonEmpty(i: Double): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def key(key: String): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def left[S, E, A](sea: typings.monocleTs.lensMod.Lens_[S, Either_[E, A]]): typings.monocleTs.optionalMod.Optional_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, E]]
    
    inline def lens[S, A](get: js.Function1[/* s */ S, A], set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]): typings.monocleTs.lensMod.Lens_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lens")(get.asInstanceOf[js.Any], set.asInstanceOf[js.Any])).asInstanceOf[typings.monocleTs.lensMod.Lens_[S, A]]
    
    inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ typings.monocleTs.lensMod.Lens_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ typings.monocleTs.lensMod.Lens_[Any, A], js.Function1[/* s */ Any, Any]]]
    
    inline def modifyF[F](F: Functor[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Functor1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Functor2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Functor3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.lensMod.Lens_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ]]
    
    inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def props[A, P /* <: /* keyof A */ String */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param props because its type [P, P, ...ReadonlyArray<P>] is not an array type */ props: Array[P]
    ): js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("props")(props.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.lensMod.Lens_[Any, A], 
        typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ]]
    
    inline def right[S, E, A](sea: typings.monocleTs.lensMod.Lens_[S, Either_[E, A]]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def some[S, A](soa: typings.monocleTs.lensMod.Lens_[S, Option_[A]]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
        /* sta */ typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sta */ typings.monocleTs.lensMod.Lens_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    /* augmented module */
    object fpTsLibHKTAugmentingMod {
      
      @js.native
      trait URItoKind2[E, A] extends StObject
    }
  }
  
  object optional {
    
    @JSImport("monocle-ts", "optional")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("monocle-ts", "optional.Category")
    @js.native
    val Category: Category2[typings.monocleTs.optionalMod.URI] = js.native
    
    @JSImport("monocle-ts", "optional.Invariant")
    @js.native
    val Invariant: Invariant2[typings.monocleTs.optionalMod.URI] = js.native
    
    @JSImport("monocle-ts", "optional.Semigroupoid")
    @js.native
    val Semigroupoid: Semigroupoid2[typings.monocleTs.optionalMod.URI] = js.native
    
    @JSImport("monocle-ts", "optional.URI")
    @js.native
    val URI: /* "monocle-ts/Optional" */ String = js.native
    
    inline def asTraversal[S, A](sa: typings.monocleTs.optionalMod.Optional_[S, A]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def atKey(key: String): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Option_[Any]]
      ]]
    
    inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def compose[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeIso[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeLens[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeOptional[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composePrism[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeTraversal[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def filter[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def fromNullable[S, A](sa: typings.monocleTs.optionalMod.Optional_[S, A]): typings.monocleTs.optionalMod.Optional_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, NonNullable[A]]]
    
    inline def id[S](): typings.monocleTs.optionalMod.Optional_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, S]]
    
    inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[
        /* fa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* fa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def index(i: Double): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def indexNonEmpty(i: Double): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def key(key: String): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyRecord_[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, ReadonlyRecord_[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def left[S, E, A](sea: typings.monocleTs.optionalMod.Optional_[S, Either_[E, A]]): typings.monocleTs.optionalMod.Optional_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, E]]
    
    inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ]]
    
    inline def modifyF[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.optionalMod.Optional_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ]]
    
    inline def modifyOption[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyOption")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ]]
    
    inline def optional[S, A](
      getOption: js.Function1[/* s */ S, Option_[A]],
      set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]
    ): typings.monocleTs.optionalMod.Optional_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("optional")(getOption.asInstanceOf[js.Any], set.asInstanceOf[js.Any])).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ]]
    
    inline def right[S, E, A](sea: typings.monocleTs.optionalMod.Optional_[S, Either_[E, A]]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def setOption[A](a: A): js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setOption")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* optional */ typings.monocleTs.optionalMod.Optional_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ]]
    
    inline def some[S, A](soa: typings.monocleTs.optionalMod.Optional_[S, Option_[A]]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
        /* sta */ typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sta */ typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    /* augmented module */
    object fpTsLibHKTAugmentingMod {
      
      @js.native
      trait URItoKind2[E, A] extends StObject
    }
  }
  
  object prism {
    
    @JSImport("monocle-ts", "prism")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("monocle-ts", "prism.Category")
    @js.native
    val Category: Category2[typings.monocleTs.prismMod.URI] = js.native
    
    @JSImport("monocle-ts", "prism.Invariant")
    @js.native
    val Invariant: Invariant2[typings.monocleTs.prismMod.URI] = js.native
    
    @JSImport("monocle-ts", "prism.Semigroupoid")
    @js.native
    val Semigroupoid: Semigroupoid2[typings.monocleTs.prismMod.URI] = js.native
    
    @JSImport("monocle-ts", "prism.URI")
    @js.native
    val URI: /* "monocle-ts/Prism" */ String = js.native
    
    inline def asOptional[S, A](sa: typings.monocleTs.prismMod.Prism_[S, A]): typings.monocleTs.optionalMod.Optional_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asOptional")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.optionalMod.Optional_[S, A]]
    
    inline def asTraversal[S, A](sa: typings.monocleTs.prismMod.Prism_[S, A]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("asTraversal")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def atKey(key: String): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Option_[Any]]
      ]]
    
    inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def compose[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def composeIso[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def composeLens[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composeOptional[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def composePrism[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def composeTraversal[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def filter[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, A]
      ]]
    
    inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def findFirst[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, A]
      ]]
    
    inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[A]], 
        typings.monocleTs.optionalMod.Optional_[Any, B]
      ]]
    
    inline def fromNullable[S, A](sa: typings.monocleTs.prismMod.Prism_[S, A]): typings.monocleTs.prismMod.Prism_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, NonNullable[A]]]
    
    inline def fromPredicate[A](predicate: Predicate[A]): typings.monocleTs.prismMod.Prism_[A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(predicate.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[A, A]]
    
    inline def fromPredicate_SA[S, A /* <: S */](refinement: Refinement[S, A]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPredicate")(refinement.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def id[S](): typings.monocleTs.prismMod.Prism_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.monocleTs.prismMod.Prism_[S, S]]
    
    inline def imap[A, B](f: js.Function1[/* a */ A, B], g: js.Function1[/* b */ B, A]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("imap")(f.asInstanceOf[js.Any], g.asInstanceOf[js.Any])).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.prismMod.Prism_[Any, B]
      ]]
    
    inline def index(i: Double): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, js.Array[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def indexNonEmpty(i: Double): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def key(key: String): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, Record[String, Any]], 
        typings.monocleTs.optionalMod.Optional_[Any, Any]
      ]]
    
    inline def left[S, E, A](sea: typings.monocleTs.prismMod.Prism_[S, Either_[E, A]]): typings.monocleTs.prismMod.Prism_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, E]]
    
    inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[/* sa */ typings.monocleTs.prismMod.Prism_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ typings.monocleTs.prismMod.Prism_[Any, A], js.Function1[/* s */ Any, Any]]]
    
    inline def modifyF[F](F: Applicative[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](F: Applicative1[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<F, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](F: Applicative2[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<F, E, S> */ Any
          ]
        ]
      ]]
    inline def modifyF[F /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](F: Applicative3[F]): js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyF")(F.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[
          /* a */ Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, A> */ Any
        ], 
        js.Function1[
          /* sa */ typings.monocleTs.prismMod.Prism_[Any, Any], 
          js.Function1[
            /* s */ Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<F, R, E, S> */ Any
          ]
        ]
      ]]
    
    inline def modifyOption[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyOption")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        js.Function1[/* s */ Any, Option_[Any]]
      ]]
    
    inline def prism[S, A](getOption: js.Function1[/* s */ S, Option_[A]], reverseGet: js.Function1[/* a */ A, S]): typings.monocleTs.prismMod.Prism_[S, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("prism")(getOption.asInstanceOf[js.Any], reverseGet.asInstanceOf[js.Any])).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.prismMod.Prism_[Any, A], 
        typings.monocleTs.optionalMod.Optional_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ]]
    
    inline def right[S, E, A](sea: typings.monocleTs.prismMod.Prism_[S, Either_[E, A]]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def set[A](a: A): js.Function1[/* sa */ typings.monocleTs.prismMod.Prism_[Any, A], js.Function1[/* s */ Any, Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ typings.monocleTs.prismMod.Prism_[Any, A], js.Function1[/* s */ Any, Any]]]
    
    inline def some[S, A](soa: typings.monocleTs.prismMod.Prism_[S, Option_[A]]): typings.monocleTs.prismMod.Prism_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.prismMod.Prism_[S, A]]
    
    inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
        /* sta */ typings.monocleTs.prismMod.Prism_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sta */ typings.monocleTs.prismMod.Prism_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    /* augmented module */
    object fpTsLibHKTAugmentingMod {
      
      @js.native
      trait URItoKind2[E, A] extends StObject
    }
  }
  
  object traversal {
    
    @JSImport("monocle-ts", "traversal")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("monocle-ts", "traversal.Category")
    @js.native
    val Category: Category2[typings.monocleTs.traversalMod.URI] = js.native
    
    @JSImport("monocle-ts", "traversal.Semigroupoid")
    @js.native
    val Semigroupoid: Semigroupoid2[typings.monocleTs.traversalMod.URI] = js.native
    
    @JSImport("monocle-ts", "traversal.URI")
    @js.native
    val URI: /* "monocle-ts/Traversal" */ String = js.native
    
    inline def atKey(key: String): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Record[String, Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Option_[Any]]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("atKey")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Record[String, Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Option_[Any]]
      ]]
    
    inline def component[A /* <: js.Array[Any] */, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("component")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def compose[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("compose")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def composeIso[A, B](ab: typings.monocleTs.isoMod.Iso_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeIso")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def composeLens[A, B](ab: typings.monocleTs.lensMod.Lens_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeLens")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def composeOptional[A, B](ab: typings.monocleTs.optionalMod.Optional_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeOptional")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def composePrism[A, B](ab: typings.monocleTs.prismMod.Prism_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composePrism")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def composeTraversal[A, B](ab: typings.monocleTs.traversalMod.Traversal_[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("composeTraversal")(ab.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def filter[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ]]
    
    inline def filter_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("filter")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def findFirst[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ]]
    
    inline def findFirstNonEmpty[A](predicate: Predicate[A]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, A]
      ]]
    
    inline def findFirstNonEmpty_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirstNonEmpty")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def findFirst_AB[A, B /* <: A */](refinement: Refinement[A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("findFirst")(refinement.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[A]], 
        typings.monocleTs.traversalMod.Traversal_[Any, B]
      ]]
    
    inline def fold[A](M: Monoid[A]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, A]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fold")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, A]
      ]]
    
    inline def foldMap[M](M: Monoid[M]): js.Function1[
        /* f */ js.Function1[/* a */ Any, M], 
        js.Function1[
          /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Any], 
          js.Function1[/* s */ Any, M]
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("foldMap")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* f */ js.Function1[/* a */ Any, M], 
        js.Function1[
          /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Any], 
          js.Function1[/* s */ Any, M]
        ]
      ]]
    
    inline def fromNullable[S, A](sa: typings.monocleTs.traversalMod.Traversal_[S, A]): typings.monocleTs.traversalMod.Traversal_[S, NonNullable[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromNullable")(sa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, NonNullable[A]]]
    
    inline def fromTraversable[T](T: Traversable[T]): js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
          Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HKT<T, A> */ Any, 
          Any
        ]
      ]]
    inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
          Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any, 
          Any
        ]
      ]]
    inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS2 */ Any */](T: Traversable2[T]): js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ Any, 
          Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind2<T, E, A> */ Any, 
          Any
        ]
      ]]
    inline def fromTraversable[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS3 */ Any */](T: Traversable3[T]): js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ Any, 
          Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTraversable")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function0[
        typings.monocleTs.traversalMod.Traversal_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind3<T, R, E, A> */ Any, 
          Any
        ]
      ]]
    
    inline def getAll[S](s: S): js.Function1[/* sa */ typings.monocleTs.traversalMod.Traversal_[S, Any], js.Array[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAll")(s.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* sa */ typings.monocleTs.traversalMod.Traversal_[S, Any], js.Array[Any]]]
    
    inline def id[S](): typings.monocleTs.traversalMod.Traversal_[S, S] = ^.asInstanceOf[js.Dynamic].applyDynamic("id")().asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, S]]
    
    inline def index(i: Double): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("index")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, js.Array[Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    inline def indexNonEmpty(i: Double): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("indexNonEmpty")(i.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, ReadonlyNonEmptyArray_[Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    inline def key(key: String): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Record[String, Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("key")(key.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, Record[String, Any]], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    inline def left[S, E, A](sea: typings.monocleTs.traversalMod.Traversal_[S, Either_[E, A]]): typings.monocleTs.traversalMod.Traversal_[S, E] = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, E]]
    
    inline def modify[A, B /* <: A */](f: js.Function1[/* a */ A, B]): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("modify")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ]]
    
    inline def prop[A, P /* <: /* keyof A */ String */](prop: P): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("prop")(prop.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: A[P] */ js.Any
        ]
      ]]
    
    inline def props[A, P /* <: /* keyof A */ String */](props_0: P, props_1: P, props_2: P*): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("props")((scala.List(props_0.asInstanceOf[js.Any], props_1.asInstanceOf[js.Any])).`++`(props_2.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in P ]: A[K]}
      */ typings.monocleTs.monocleTsStrings.props & TopLevel[A]
        ]
      ]]
    
    inline def right[S, E, A](sea: typings.monocleTs.traversalMod.Traversal_[S, Either_[E, A]]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("right")(sea.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def set[A](a: A): js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(a.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sa */ typings.monocleTs.traversalMod.Traversal_[Any, A], 
        js.Function1[/* s */ Any, Any]
      ]]
    
    inline def some[S, A](soa: typings.monocleTs.traversalMod.Traversal_[S, Option_[A]]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("some")(soa.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def traversal[S, A](modifyF: typings.monocleTs.traversalMod.ModifyF[S, A]): typings.monocleTs.traversalMod.Traversal_[S, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("traversal")(modifyF.asInstanceOf[js.Any]).asInstanceOf[typings.monocleTs.traversalMod.Traversal_[S, A]]
    
    inline def traverse[T /* <: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify URIS */ Any */](T: Traversable1[T]): js.Function1[
        /* sta */ typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("traverse")(T.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
        /* sta */ typings.monocleTs.traversalMod.Traversal_[
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Kind<T, A> */ Any
        ], 
        typings.monocleTs.traversalMod.Traversal_[Any, Any]
      ]]
    
    /* augmented module */
    object fpTsLibHKTAugmentingMod {
      
      @js.native
      trait URItoKind2[E, A] extends StObject
    }
  }
  
  @js.native
  trait LensFromPath[S] extends StObject {
    
    def apply[K1 /* <: /* keyof S */ String */](path: js.Array[K1]): Lens_[
        S, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[K1] */ js.Any
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1] */ js.Any */](path: js.Tuple2[K1, K2]): Lens_[
        S, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[K1][K2] */ js.Any
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2] */ js.Any */](path: js.Tuple3[K1, K2, K3]): Lens_[
        S, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[K1][K2][K3] */ js.Any
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */](path: js.Tuple4[K1, K2, K3, K4]): Lens_[
        S, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[K1][K2][K3][K4] */ js.Any
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: importer.ImportType#apply Failed type conversion: keyof S[K1][K2][K3][K4] */ js.Any */](path: js.Tuple5[K1, K2, K3, K4, K5]): Lens_[
        S, 
        /* import warning: importer.ImportType#apply Failed type conversion: S[K1][K2][K3][K4][K5] */ js.Any
      ] = js.native
  }
  
  type ModifyF[S, A] = typings.monocleTs.traversalMod.ModifyF[S, A]
  
  type OptionPropertyNames[S] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof S ]: -? S[K] extends fp-ts.fp-ts/lib/Option.Option<any>? K : never}[keyof S] */ js.Any
  
  type OptionPropertyType[S, K /* <: OptionPropertyNames[S] */] = Any
  
  @js.native
  trait OptionalFromPath[S] extends StObject {
    
    def apply[K1 /* <: /* keyof S */ String */](path: js.Array[K1]): Optional_[
        S, 
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: S[K1] */ js.Any
        ]
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* keyof std.NonNullable<S[K1]> */ String */](path: js.Tuple2[K1, K2]): Optional_[
        S, 
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<S[K1]>[K2] */ js.Any
        ]
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* keyof std.NonNullable<S[K1]> */ String */, K3 /* <: /* keyof std.NonNullable<std.NonNullable<S[K1]>[K2]> */ String */](path: js.Tuple3[K1, K2, K3]): Optional_[
        S, 
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3] */ js.Any
        ]
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* keyof std.NonNullable<S[K1]> */ String */, K3 /* <: /* keyof std.NonNullable<std.NonNullable<S[K1]>[K2]> */ String */, K4 /* <: /* keyof std.NonNullable<std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3]> */ String */](path: js.Tuple4[K1, K2, K3, K4]): Optional_[
        S, 
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3]>[K4] */ js.Any
        ]
      ] = js.native
    def apply[K1 /* <: /* keyof S */ String */, K2 /* <: /* keyof std.NonNullable<S[K1]> */ String */, K3 /* <: /* keyof std.NonNullable<std.NonNullable<S[K1]>[K2]> */ String */, K4 /* <: /* keyof std.NonNullable<std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3]> */ String */, K5 /* <: /* keyof std.NonNullable<std.NonNullable<std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3]>[K4]> */ String */](path: js.Tuple5[K1, K2, K3, K4, K5]): Optional_[
        S, 
        NonNullable[
          /* import warning: importer.ImportType#apply Failed type conversion: std.NonNullable<std.NonNullable<std.NonNullable<std.NonNullable<S[K1]>[K2]>[K3]>[K4]>[K5] */ js.Any
        ]
      ] = js.native
  }
}
