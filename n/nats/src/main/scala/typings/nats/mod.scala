package typings.nats

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("nats", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def connect(): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NatsConnection */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")().asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NatsConnection */ Any
  ]]
  inline def connect(
    opts: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ConnectionOptions */ Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NatsConnection */ Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify NatsConnection */ Any
  ]]
}
