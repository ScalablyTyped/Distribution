package typings.mendixmodelsdk.anon

import org.scalablytyped.runtime.Instantiable3
import typings.mendixmodelsdk.abstractModelMod.IAbstractModel
import typings.mendixmodelsdk.commonMod.common.IErrorCallback
import typings.mendixmodelsdk.configurationMod.configuration.ISdkConfig
import typings.mendixmodelsdk.imodelserverclientMod.IModelServerClient
import typings.mendixmodelsdk.internalMod.AbstractModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instantiable[CT /* <: AbstractModel with IT */, IT /* <: IAbstractModel */] extends Instantiable3[
      /* _client */ IModelServerClient, 
      /* _errorHandler */ IErrorCallback, 
      /* _connectionConfig */ ISdkConfig, 
      CT
    ]

