package typings.openidClient.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.openidClient.anon.Keys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOfGenericClient[TClient /* <: BaseClient */]
  extends StObject
     with Instantiable1[/* metadata */ ClientMetadata, TClient]
     with Instantiable2[/* metadata */ ClientMetadata, /* jwks */ Keys, TClient]
     with Instantiable3[
      /* metadata */ ClientMetadata, 
      (/* jwks */ Keys) | (/* jwks */ Unit), 
      /* options */ ClientOptions, 
      TClient
    ]
