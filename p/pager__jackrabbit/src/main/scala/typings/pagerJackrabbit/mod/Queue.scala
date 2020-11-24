package typings.pagerJackrabbit.mod

import typings.amqplib.mod.Connection
import typings.amqplib.propertiesMod.Options.Consume
import typings.node.eventsMod.global.NodeJS.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Queue extends EventEmitter {
  
  def cancel(done: js.Any): Unit = js.native
  
  def connect(con: Connection): Unit = js.native
  
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[Unit], 
      /* msg */ Message, 
      Unit
    ]
  ): Unit = js.native
  def consume(
    callback: js.Function4[
      /* data */ js.Any, 
      /* ack */ AckCallback, 
      /* nack */ js.Function0[Unit], 
      /* msg */ Message, 
      Unit
    ],
    options: Consume
  ): Unit = js.native
  
  var name: String = js.native
  
  var options: QueueOptions = js.native
  
  def purge(done: js.Any): Unit = js.native
}
