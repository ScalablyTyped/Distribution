package typings.nodeDashExpat

import typings.node.Buffer
import typings.node.streamMod.internal
import typings.nodeDashExpat.nodeDashExpatMod.Parser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-expat", JSImport.Namespace)
@js.native
object nodeDashExpatMod extends js.Object {
  @js.native
  class Parser () extends internal {
    def this(encoding: String) = this()
    var readable: Boolean = js.native
    // encoding: string;
    // Stream API
    var writable: Boolean = js.native
    def _getNewParser(): Parser = js.native
    def destroy(): Unit = js.native
    def destroySoon(): Unit = js.native
    def end(): Unit = js.native
    def end(cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any): Unit = js.native
    def end(chunk: js.Any, cb: js.Function0[Unit]): Unit = js.native
    def end(chunk: js.Any, encoding: String): Unit = js.native
    def end(chunk: js.Any, encoding: String, cb: js.Function0[Unit]): Unit = js.native
    def getCurrentByteIndex(): Double = js.native
    def getCurrentColumnNumber(): Double = js.native
    def getCurrentLineNumber(): Double = js.native
    def getError(): String = js.native
    def parse(buf: String): Boolean = js.native
    def parse(buf: String, isFinal: Boolean): Boolean = js.native
    // emit(): Function;
    def parse(buf: Buffer): Boolean = js.native
    def parse(buf: Buffer, isFinal: Boolean): Boolean = js.native
    def pause(): Unit = js.native
    def reset(): Unit = js.native
    def resume(): Unit = js.native
    def setEncoding(encoding: String): Unit = js.native
    def setUnknownEncoding(map: js.Array[Double]): Unit = js.native
    def setUnknownEncoding(map: js.Array[Double], convert: String): Unit = js.native
    def stop(): Unit = js.native
    def write(data: String): Boolean = js.native
    def write(data: Buffer): Boolean = js.native
  }
  
  def createParser(): Parser = js.native
  def createParser(cb: js.Function1[/* repeated */ js.Any, Unit]): Parser = js.native
}

