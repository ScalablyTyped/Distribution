package typings
package nexpectLib.nexpectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IChain extends js.Object {
  def expect(expectation: java.lang.String): IChain = js.native
  def expect(expectation: stdLib.RegExp): IChain = js.native
  def run(
    callback: js.Function3[
      /* err */ stdLib.Error, 
      /* output */ js.Array[java.lang.String], 
      /* exit */ java.lang.String | scala.Double, 
      scala.Unit
    ]
  ): nodeLib.childUnderscoreProcessMod.ChildProcess = js.native
  def sendEof(): IChain = js.native
  def sendline(line: java.lang.String): IChain = js.native
  def wait(expectation: java.lang.String): IChain = js.native
  def wait(expectation: stdLib.RegExp): IChain = js.native
}

