package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts", "Lens")
@js.native
class Lens[S, A] protected () extends js.Object {
  def this(get: js.Function1[/* s */ S, A], set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Lens = js.native
  /** view a Lens as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** view a Lens as a Getter */
  def asGetter(): Getter[S, A] = js.native
  /** view a Lens as a Optional */
  def asOptional(): Optional[S, A] = js.native
  /** view a Lens as a Setter */
  def asSetter(): Setter[S, A] = js.native
  /** view a Lens as a Traversal */
  def asTraversal(): Traversal[S, A] = js.native
  /** compose a Lens with a Lens */
  def compose[B](ab: Lens[A, B]): Lens[S, B] = js.native
  /** compose a Lens with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose a Lens with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Getter[S, B] = js.native
  /** compose a Lens with an Iso */
  def composeIso[B](ab: Iso[A, B]): Lens[S, B] = js.native
  /** @alias of `compose` */
  def composeLens[B](ab: Lens[A, B]): Lens[S, B] = js.native
  /** compose a Lens with an Optional */
  def composeOptional[B](ab: Optional[A, B]): Optional[S, B] = js.native
  /** compose a Lens with a Prism */
  def composePrism[B](ab: Prism[A, B]): Optional[S, B] = js.native
  /** compose a Lens with an Setter */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose a Lens with an Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  def get(s: S): A = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

/* static members */
@JSImport("monocle-ts", "Lens")
@js.native
object Lens extends js.Object {
  /**
    * generate a lens from a type and a prop whose type is nullable
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
    * assert.deepStrictEqual(lens.set(1)({})), { inner: { value: 1, foo: 'foo' } })
    * assert.strictEqual(lens.get({})), 0)
    * assert.deepStrictEqual(lens.set(1)({ inner: { value: 1, foo: 'bar' } })), { inner: { value: 1, foo: 'bar' } })
    * assert.strictEqual(lens.get({ inner: { value: 1, foo: 'bar' } })), 1)
    */
  def fromNullableProp[S](): js.Function2[
    /* k */ java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: S[keyof S] */ /* defaultValue */ js.Any, 
    monocleDashTsLib.monocleDashTsMod.Lens[
      S, 
      stdLib.NonNullable[/* import warning: ImportType.apply Failed type conversion: S[keyof S] */ js.Any]
    ]
  ] = js.native
  def fromNullableProp[S, A /* <: /* import warning: ImportType.apply Failed type conversion: S[K] */ js.Any */, K /* <: java.lang.String */](k: K, defaultValue: A): monocleDashTsLib.monocleDashTsMod.Lens[
    S, 
    stdLib.NonNullable[/* import warning: ImportType.apply Failed type conversion: S[K] */ js.Any]
  ] = js.native
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
    */
  def fromPath[S](): monocleDashTsLib.monocleDashTsMod.LensFromPath[S] = js.native
  def fromPath[S, K1 /* <: java.lang.String */](path: js.Array[K1]): monocleDashTsLib.monocleDashTsMod.Lens[S, /* import warning: ImportType.apply Failed type conversion: S[K1] */ js.Any] = js.native
  def fromPath[S, K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */](path: js.Tuple2[K1, K2]): monocleDashTsLib.monocleDashTsMod.Lens[S, /* import warning: ImportType.apply Failed type conversion: S[K1][K2] */ js.Any] = js.native
  def fromPath[S, K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */](path: js.Tuple3[K1, K2, K3]): monocleDashTsLib.monocleDashTsMod.Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3] */ js.Any
  ] = js.native
  def fromPath[S, K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */](path: js.Tuple4[K1, K2, K3, K4]): monocleDashTsLib.monocleDashTsMod.Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3][K4] */ js.Any
  ] = js.native
  def fromPath[S, K1 /* <: java.lang.String */, K2 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1] */ js.Any */, K3 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2] */ js.Any */, K4 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3] */ js.Any */, K5 /* <: /* import warning: ImportType.apply Failed type conversion: keyof S[K1][K2][K3][K4] */ js.Any */](path: js.Tuple5[K1, K2, K3, K4, K5]): monocleDashTsLib.monocleDashTsMod.Lens[
    S, 
    /* import warning: ImportType.apply Failed type conversion: S[K1][K2][K3][K4][K5] */ js.Any
  ] = js.native
  /**
    * generate a lens from a type and a prop
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
    * // or (deprecated)
    * // const age = Lens.fromProp<Person, 'age'>('age')
    *
    * const person: Person = { name: 'Giulio', age: 43 }
    *
    * assert.strictEqual(age.get(person), 43)
    * assert.deepStrictEqual(age.set(44)(person), { name: 'Giulio', age: 44 })
    */
  def fromProp[S](): js.Function1[
    /* prop */ java.lang.String, 
    monocleDashTsLib.monocleDashTsMod.Lens[
      S, 
      /* import warning: ImportType.apply Failed type conversion: S[keyof S] */ js.Any
    ]
  ] = js.native
  def fromProp[S, P /* <: java.lang.String */](prop: P): monocleDashTsLib.monocleDashTsMod.Lens[S, /* import warning: ImportType.apply Failed type conversion: S[P] */ js.Any] = js.native
  /**
    * generate a lens from a type and an array of props
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
    */
  def fromProps[S](): js.Function1[
    /* props */ js.Array[java.lang.String], 
    monocleDashTsLib.monocleDashTsMod.Lens[
      S, 
      /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ K in keyof S ]: S[K]}
    */ monocleDashTsLib.monocleDashTsLibStrings.Lens with S
    ]
  ] = js.native
}

