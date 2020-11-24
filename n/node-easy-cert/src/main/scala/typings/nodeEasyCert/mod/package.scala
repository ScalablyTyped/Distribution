package typings.nodeEasyCert

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GenerateCallback = js.Function3[
    /* err */ typings.std.Error | typings.nodeEasyCert.mod.CertErrors | scala.Null, 
    /* keyPath */ java.lang.String, 
    /* certPath */ java.lang.String, 
    js.Any
  ]
  
  type GetCertificateCallback = js.Function3[
    /* err */ typings.std.Error | typings.nodeEasyCert.mod.CertErrors | scala.Null, 
    /* keyContent */ java.lang.String, 
    /* certContent */ java.lang.String, 
    js.Any
  ]
}
