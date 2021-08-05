package typings.meteorPublishComposite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("meteor/reywood:publish-composite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def publishComposite(
    name: String,
    configFunc: js.Function1[
      /* repeated */ js.Any, 
      PublishCompositeConfig[js.Any] | js.Array[PublishCompositeConfig[js.Any]]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publishComposite")(name.asInstanceOf[js.Any], configFunc.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publishComposite(name: String, config: js.Array[PublishCompositeConfig[js.Any]]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publishComposite")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def publishComposite(name: String, config: PublishCompositeConfig[js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("publishComposite")(name.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
