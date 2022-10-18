package typings.node.cryptoMod

import typings.node.NodeJS.ArrayBufferView
import typings.node.anon.PlaintextLength
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CipherOCB extends StObject {
  
  def getAuthTag(): Buffer = js.native
  
  def setAAD(buffer: ArrayBufferView): this.type = js.native
  def setAAD(buffer: ArrayBufferView, options: PlaintextLength): this.type = js.native
}
