package typings.observeJs.mod.observejs

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*----------------------
  PathObserver
  ----------------------*/
@js.native
trait PathObserverStatic
  extends /**
  * Constructor
  * @param receiver the target for observation
  * @param path specifies the paht to observe. If path === '' the receiver itself gets observed.
  * @param defaultValue the defaultValue
  */
Instantiable2[/* receiver */ js.Any, /* path */ String, PathObserverInstance]
     with Instantiable3[
      /* receiver */ js.Any, 
      /* path */ String, 
      /* defaultValue */ js.Any, 
      PathObserverInstance
    ]
