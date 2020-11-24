package typings.nextAuth.adaptersMod

import org.scalablytyped.runtime.TopLevel
import typings.nextAuth.anon.Models
import typings.typeorm.connectionConnectionOptionsMod.ConnectionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Adapters extends js.Object {
  
  var Default: js.Function2[
    /* typeOrmConfig */ ConnectionOptions, 
    /* options */ js.UndefOr[Models], 
    Adapter[_, Profile, _, _]
  ] = js.native
  
  var Prisma: PrismaAdapter = js.native
  
  var TypeORM: TypeORMAdapter[_, _, _, _] = js.native
}
@JSImport("next-auth/adapters", "Adapters")
@js.native
object Adapters extends TopLevel[Adapters]
