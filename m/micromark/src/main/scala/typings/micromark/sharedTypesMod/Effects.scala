package typings.micromark.sharedTypesMod

import typings.micromark.codesMod.Code
import typings.micromark.typesMod.Type
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Effects extends js.Object {
  
  def attempt(constructInfo: js.Array[Construct], returnState: State): js.Function1[/* code */ Code, Unit] = js.native
  def attempt(constructInfo: js.Array[Construct], returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit] = js.native
  /**
    * Attempt deals with several values, and tries to parse according to those values.
    * If a value resulted in `ok`, it worked, the tokens that were made are used,
    * and `returnState` is switched to.
    * If the result is `nok`, the attempt failed,
    * so we revert to the original state, and `bogusState` is used.
    */
  def attempt(constructInfo: Construct, returnState: State): js.Function1[/* code */ Code, Unit] = js.native
  def attempt(constructInfo: Construct, returnState: State, bogusState: State): js.Function1[/* code */ Code, Unit] = js.native
  def attempt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], returnState: State): js.Function1[/* code */ Code, Unit] = js.native
  def attempt(
    constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]],
    returnState: State,
    bogusState: State
  ): js.Function1[/* code */ Code, Unit] = js.native
  
  def check(constructInfo: js.Array[Construct], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def check(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  def check(constructInfo: Construct, ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def check(constructInfo: Construct, ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  def check(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def check(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  
  /**
    * Consume deals with a character, and moves to the next
    */
  def consume(code: Double): Unit = js.native
  
  /**
    * Enter and exit define where tokens start and end
    */
  def enter(`type`: Type): Token = js.native
  
  /**
    * Enter and exit define where tokens start and end
    */
  def exit(`type`: Type): Token = js.native
  
  def interrupt(constructInfo: js.Array[Construct], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def interrupt(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  /**
    * Interrupt is used for stuff right after a line of content.
    */
  def interrupt(constructInfo: Construct, ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def interrupt(constructInfo: Construct, ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  def interrupt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): js.Function1[/* code */ Code, Unit] = js.native
  def interrupt(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): js.Function1[/* code */ Code, Unit] = js.native
  
  def `lazy`(constructInfo: js.Array[Construct], ok: Okay): Unit = js.native
  def `lazy`(constructInfo: js.Array[Construct], ok: Okay, nok: NotOkay): Unit = js.native
  /**
    * Lazy is used for lines that were not properly preceded by the container.
    */
  def `lazy`(constructInfo: Construct, ok: Okay): Unit = js.native
  def `lazy`(constructInfo: Construct, ok: Okay, nok: NotOkay): Unit = js.native
  def `lazy`(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay): Unit = js.native
  def `lazy`(constructInfo: Record[CodeAsKey, Construct | js.Array[Construct]], ok: Okay, nok: NotOkay): Unit = js.native
}
