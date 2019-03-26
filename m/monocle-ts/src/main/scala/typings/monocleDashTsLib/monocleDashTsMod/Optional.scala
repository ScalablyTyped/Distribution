package typings
package monocleDashTsLib.monocleDashTsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("monocle-ts", "Optional")
@js.native
class Optional[S, A] protected () extends js.Object {
  def this(getOption: js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[A]], set: js.Function1[/* a */ A, js.Function1[/* s */ S, S]]) = this()
  val _tag: monocleDashTsLib.monocleDashTsLibStrings.Optional = js.native
  /** view an Optional as a Fold */
  def asFold(): Fold[S, A] = js.native
  /** view an Optional as a Setter */
  def asSetter(): Setter[S, A] = js.native
  /** view a Optional as a Traversal */
  def asTraversal(): Traversal[S, A] = js.native
  /** compose a Optional with a Optional */
  def compose[B](ab: Optional[A, B]): Optional[S, B] = js.native
  /** compose an Optional with a Fold */
  def composeFold[B](ab: Fold[A, B]): Fold[S, B] = js.native
  /** compose an Optional with a Getter */
  def composeGetter[B](ab: Getter[A, B]): Fold[S, B] = js.native
  /** compose an Optional with a Iso */
  def composeIso[B](ab: Iso[A, B]): Optional[S, B] = js.native
  /** compose an Optional with a Lens */
  def composeLens[B](ab: Lens[A, B]): Optional[S, B] = js.native
  /** @alias of `compose` */
  def composeOptional[B](ab: Optional[A, B]): Optional[S, B] = js.native
  /** compose an Optional with a Prism */
  def composePrism[B](ab: Prism[A, B]): Optional[S, B] = js.native
  /** compose an Optional with a Setter */
  def composeSetter[B](ab: Setter[A, B]): Setter[S, B] = js.native
  /** compose an Optional with a Traversal */
  def composeTraversal[B](ab: Traversal[A, B]): Traversal[S, B] = js.native
  def getOption(s: S): fpDashTsLib.libOptionMod.Option[A] = js.native
  def modify(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, S] = js.native
  def modifyOption(f: js.Function1[/* a */ A, A]): js.Function1[/* s */ S, fpDashTsLib.libOptionMod.Option[S]] = js.native
  def set(a: A): js.Function1[/* s */ S, S] = js.native
}

/* static members */
@JSImport("monocle-ts", "Optional")
@js.native
object Optional extends js.Object {
  /**
    * @example
    * import { Optional, Lens } from 'monocle-ts'
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
    * const info = Optional.fromNullableProp<Response>()('info')
    * const employment = Optional.fromNullableProp<Info>()('employment')
    * const phone = Optional.fromNullableProp<Employment>()('phone')
    * const number = Lens.fromProp<Phone>()('number')
    * const numberFromResponse = info
    *   .compose(employment)
    *   .compose(phone)
    *   .composeLens(number)
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
    */
  def fromNullableProp[S](): js.Function1[
    /* k */ java.lang.String, 
    monocleDashTsLib.monocleDashTsMod.Optional[
      S, 
      stdLib.NonNullable[/* import warning: ImportType.apply Failed type conversion: S[keyof S] */ js.Any]
    ]
  ] = js.native
  def fromNullableProp[S, A /* <: /* import warning: ImportType.apply Failed type conversion: S[K] */ js.Any */, K /* <: java.lang.String */](k: K): monocleDashTsLib.monocleDashTsMod.Optional[
    S, 
    stdLib.NonNullable[/* import warning: ImportType.apply Failed type conversion: S[K] */ js.Any]
  ] = js.native
  /**
    * @example
    * import { Optional, Lens } from 'monocle-ts'
    * import { Option } from 'fp-ts/lib/Option'
    *
    * interface Phone {
    *   number: string
    * }
    * interface Employment {
    *   phone: Option<Phone>
    * }
    * interface Info {
    *   employment: Option<Employment>
    * }
    * interface Response {
    *   info: Option<Info>
    * }
    *
    * const info = Optional.fromOptionProp<Response>('info')
    * const employment = Optional.fromOptionProp<Info>('employment')
    * const phone = Optional.fromOptionProp<Employment>('phone')
    * const number = Lens.fromProp<Phone>()('number')
    * export const numberFromResponse = info
    *   .compose(employment)
    *   .compose(phone)
    *   .composeLens(number)
    */
  def fromOptionProp[S](): js.Function1[
    /* prop */ monocleDashTsLib.OptionPropertyNames[S], 
    monocleDashTsLib.monocleDashTsMod.Optional[S, monocleDashTsLib.OptionPropertyType[S, monocleDashTsLib.OptionPropertyNames[S]]]
  ] = js.native
  def fromOptionProp[S](prop: monocleDashTsLib.OptionPropertyNames[S]): monocleDashTsLib.monocleDashTsMod.Optional[
    S, 
    monocleDashTsLib.OptionPropertyType[S, /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof prop */ _]
  ] = js.native
}

