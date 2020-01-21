package typings.openidClient.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.jose.mod.JSONWebKeySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeOfGenericClient[TClient /* <: Client */]
  extends Instantiable1[/* metadata */ ClientMetadata, TClient]
     with Instantiable2[/* metadata */ ClientMetadata, /* jwks */ JSONWebKeySet, TClient]

