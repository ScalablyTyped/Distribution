package typings.nats

import typings.nats.anon.PartialConsumerConfig
import typings.nats.errorMod.NatsError
import typings.nats.typesMod.ConsumerConfig
import typings.nats.typesMod.Msg
import typings.nats.typesMod.Nanos
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object jsutilMod {
  
  @JSImport("nats/lib/nats-base-client/jsutil", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkJsError(msg: Msg): NatsError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsError")(msg.asInstanceOf[js.Any]).asInstanceOf[NatsError | Null]
  
  inline def checkJsErrorCode(code: Double): NatsError | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("checkJsErrorCode")(code.asInstanceOf[js.Any]).asInstanceOf[NatsError | Null]
  inline def checkJsErrorCode(code: Double, description: String): NatsError | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("checkJsErrorCode")(code.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[NatsError | Null]
  
  inline def defaultConsumer(name: String): ConsumerConfig = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultConsumer")(name.asInstanceOf[js.Any]).asInstanceOf[ConsumerConfig]
  inline def defaultConsumer(name: String, opts: PartialConsumerConfig): ConsumerConfig = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultConsumer")(name.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ConsumerConfig]
  
  inline def isFlowControlMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFlowControlMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isHeartbeatMsg(msg: Msg): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isHeartbeatMsg")(msg.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def millis(ns: Nanos): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("millis")(ns.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def nanos(millis: Double): Nanos = ^.asInstanceOf[js.Dynamic].applyDynamic("nanos")(millis.asInstanceOf[js.Any]).asInstanceOf[Nanos]
  
  inline def validateDurableName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDurableName")().asInstanceOf[Unit]
  inline def validateDurableName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateDurableName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def validateName(context: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateName")(context.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateName(context: String, name: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateName")(context.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateStreamName(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateStreamName")().asInstanceOf[Unit]
  inline def validateStreamName(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateStreamName")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
