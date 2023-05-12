package typings.nodecredstash

import typings.awsSdkClientDynamodb.distTypesCommandsDeleteItemCommandMod.DeleteItemCommandOutput
import typings.awsSdkLibDynamodb.distTypesCommandsPutCommandMod.PutCommandOutput
import typings.nodecredstash.anon.Name
import typings.nodecredstash.srcTypesMod.Configuration
import typings.nodecredstash.srcTypesMod.GetAllSecrets
import typings.nodecredstash.srcTypesMod.GetAllVersions
import typings.nodecredstash.srcTypesMod.GetHighestVersionResponse
import typings.nodecredstash.srcTypesMod.GetSecret
import typings.nodecredstash.srcTypesMod.NameAndVersionOpts
import typings.nodecredstash.srcTypesMod.NameOpts
import typings.nodecredstash.srcTypesMod.Opts
import typings.nodecredstash.srcTypesMod.PutSecret
import typings.nodecredstash.srcTypesMod.QueryOpts
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcMod {
  
  @JSImport("nodecredstash/src", "CredStash")
  @js.native
  open class CredStash () extends StObject {
    def this(param0: Configuration) = this()
    
    def createDdbTable(): js.Promise[Unit] = js.native
    def createDdbTable(cb: js.Function2[/* e */ Any | js.Error, /* data */ Unit, Unit]): Unit = js.native
    def createDdbTable(opts: Opts): js.Promise[Unit] = js.native
    def createDdbTable(opts: Opts, cb: js.Function2[/* e */ Any | js.Error, /* data */ Unit, Unit]): Unit = js.native
    
    def deleteSecret(opts: NameAndVersionOpts): js.Promise[DeleteItemCommandOutput] = js.native
    def deleteSecret(
      opts: NameAndVersionOpts,
      cb: js.Function2[/* e */ Any | js.Error, /* data */ DeleteItemCommandOutput, Unit]
    ): Unit = js.native
    
    def deleteSecrets(opts: NameOpts): js.Promise[js.Array[DeleteItemCommandOutput]] = js.native
    def deleteSecrets(
      opts: NameOpts,
      cb: js.Function2[/* e */ Any | js.Error, /* data */ js.Array[DeleteItemCommandOutput], Unit]
    ): Unit = js.native
    
    def getAllSecrets(): js.Promise[Record[String, String]] = js.native
    def getAllSecrets(cb: js.Function2[/* e */ Any | js.Error, /* data */ Record[String, String], Unit]): Unit = js.native
    def getAllSecrets(opts: GetAllSecrets): js.Promise[Record[String, String]] = js.native
    def getAllSecrets(
      opts: GetAllSecrets,
      cb: js.Function2[/* e */ Any | js.Error, /* data */ Record[String, String], Unit]
    ): Unit = js.native
    
    def getAllVersions(opts: GetAllVersions): js.Promise[js.Array[GetHighestVersionResponse]] = js.native
    def getAllVersions(
      opts: GetAllVersions,
      cb: js.Function2[/* e */ Any | js.Error, /* data */ js.Array[GetHighestVersionResponse], Unit]
    ): Unit = js.native
    
    /**
      * Retrieve the highest version of `name` in the table
      */
    def getHighestVersion(opts: NameOpts): js.Promise[String] = js.native
    def getHighestVersion(opts: NameOpts, cb: js.Function2[/* e */ Any | js.Error, /* version */ String, Unit]): Unit = js.native
    
    def getSecret(opts: GetSecret): js.Promise[String] = js.native
    def getSecret(opts: GetSecret, cb: js.Function2[/* e */ Any | js.Error, /* data */ String, Unit]): Unit = js.native
    
    def incrementVersion(opts: NameOpts): js.Promise[String] = js.native
    def incrementVersion(opts: NameOpts, cb: js.Function2[/* e */ Any | js.Error, /* version */ String, Unit]): Unit = js.native
    
    def listSecrets(): js.Promise[js.Array[Name]] = js.native
    def listSecrets(cb: js.Function2[/* e */ Any | js.Error, /* data */ js.Array[Name], Unit]): Unit = js.native
    def listSecrets(opts: QueryOpts): js.Promise[js.Array[Name]] = js.native
    def listSecrets(opts: QueryOpts, cb: js.Function2[/* e */ Any | js.Error, /* data */ js.Array[Name], Unit]): Unit = js.native
    
    def paddedInt(i: Double): String = js.native
    
    /* private */ var `private`: Any = js.native
    
    def putSecret(opts: PutSecret): js.Promise[PutCommandOutput] = js.native
    def putSecret(opts: PutSecret, cb: js.Function1[/* e */ Any | js.Error, PutCommandOutput]): Unit = js.native
  }
}
