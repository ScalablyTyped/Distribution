package typings.onflowFlowJsTesting

import typings.onflowFlowJsTesting.srcAccountMod.Address
import typings.onflowFlowJsTesting.srcAccountMod.KeyObject
import typings.onflowFlowJsTesting.srcAccountMod.PublicKey
import typings.onflowFlowJsTesting.srcAccountMod.SignerInfo
import typings.onflowFlowJsTesting.srcInteractionMod.ScriptProps
import typings.onflowFlowJsTesting.srcInteractionMod.TransactionProps
import typings.onflowFlowJsTesting.srcTransformersMod.CadenceTransformer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddressMap extends StObject {
    
    var addressMap: js.UndefOr[typings.onflowFlowJsTesting.srcAccountMod.AddressMap] = js.undefined
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var name: String
    
    var to: js.UndefOr[Address] = js.undefined
    
    var update: js.UndefOr[Boolean] = js.undefined
  }
  object AddressMap {
    
    inline def apply(name: String): AddressMap = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddressMap]
    }
    
    extension [Self <: AddressMap](x: Self) {
      
      inline def setAddressMap(value: typings.onflowFlowJsTesting.srcAccountMod.AddressMap): Self = StObject.set(x, "addressMap", value.asInstanceOf[js.Any])
      
      inline def setAddressMapUndefined: Self = StObject.set(x, "addressMap", js.undefined)
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Address): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait AdminPort extends StObject {
    
    var adminPort: js.UndefOr[Double] = js.undefined
    
    var flags: js.UndefOr[String] = js.undefined
    
    var grpcPort: js.UndefOr[Double] = js.undefined
    
    var logging: js.UndefOr[Boolean] = js.undefined
    
    var restPort: js.UndefOr[Double] = js.undefined
  }
  object AdminPort {
    
    inline def apply(): AdminPort = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AdminPort]
    }
    
    extension [Self <: AdminPort](x: Self) {
      
      inline def setAdminPort(value: Double): Self = StObject.set(x, "adminPort", value.asInstanceOf[js.Any])
      
      inline def setAdminPortUndefined: Self = StObject.set(x, "adminPort", js.undefined)
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
      
      inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
      
      inline def setGrpcPort(value: Double): Self = StObject.set(x, "grpcPort", value.asInstanceOf[js.Any])
      
      inline def setGrpcPortUndefined: Self = StObject.set(x, "grpcPort", js.undefined)
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      inline def setRestPort(value: Double): Self = StObject.set(x, "restPort", value.asInstanceOf[js.Any])
      
      inline def setRestPortUndefined: Self = StObject.set(x, "restPort", js.undefined)
    }
  }
  
  trait Args extends StObject {
    
    var addressMap: js.UndefOr[typings.onflowFlowJsTesting.srcAccountMod.AddressMap] = js.undefined
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: String
    
    var name: String
    
    var to: js.UndefOr[Address] = js.undefined
    
    var update: js.UndefOr[Boolean] = js.undefined
  }
  object Args {
    
    inline def apply(code: String, name: String): Args = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    extension [Self <: Args](x: Self) {
      
      inline def setAddressMap(value: typings.onflowFlowJsTesting.srcAccountMod.AddressMap): Self = StObject.set(x, "addressMap", value.asInstanceOf[js.Any])
      
      inline def setAddressMapUndefined: Self = StObject.set(x, "addressMap", js.undefined)
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Address): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
      
      inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
      
      inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  trait ArgsCode
    extends StObject
       with ScriptProps {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var transformers: js.UndefOr[js.Array[CadenceTransformer]] = js.undefined
  }
  object ArgsCode {
    
    inline def apply(code: String): ArgsCode = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[ArgsCode]
    }
    
    extension [Self <: ArgsCode](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTransformers(value: js.Array[CadenceTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: CadenceTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
  
  trait Code
    extends StObject
       with TransactionProps {
    
    var addressMap: js.UndefOr[typings.onflowFlowJsTesting.srcAccountMod.AddressMap] = js.undefined
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var signers: js.Array[Address | SignerInfo]
  }
  object Code {
    
    inline def apply(name: String, signers: js.Array[Address | SignerInfo]): Code = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    extension [Self <: Code](x: Self) {
      
      inline def setAddressMap(value: typings.onflowFlowJsTesting.srcAccountMod.AddressMap): Self = StObject.set(x, "addressMap", value.asInstanceOf[js.Any])
      
      inline def setAddressMapUndefined: Self = StObject.set(x, "addressMap", js.undefined)
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSigners(value: js.Array[Address | SignerInfo]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
      
      inline def setSignersVarargs(value: (Address | SignerInfo)*): Self = StObject.set(x, "signers", js.Array(value*))
    }
  }
  
  trait Keys extends StObject {
    
    var keys: js.UndefOr[js.Array[KeyObject | PublicKey]] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
  }
  object Keys {
    
    inline def apply(): Keys = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Keys]
    }
    
    extension [Self <: Keys](x: Self) {
      
      inline def setKeys(value: js.Array[KeyObject | PublicKey]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      inline def setKeysVarargs(value: (KeyObject | PublicKey)*): Self = StObject.set(x, "keys", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var addressMap: js.UndefOr[typings.onflowFlowJsTesting.srcAccountMod.AddressMap] = js.undefined
    
    var name: String
  }
  object Name {
    
    inline def apply(name: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setAddressMap(value: typings.onflowFlowJsTesting.srcAccountMod.AddressMap): Self = StObject.set(x, "addressMap", value.asInstanceOf[js.Any])
      
      inline def setAddressMapUndefined: Self = StObject.set(x, "addressMap", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pkey extends StObject {
    
    var pkey: js.UndefOr[String] = js.undefined
  }
  object Pkey {
    
    inline def apply(): Pkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Pkey]
    }
    
    extension [Self <: Pkey](x: Self) {
      
      inline def setPkey(value: String): Self = StObject.set(x, "pkey", value.asInstanceOf[js.Any])
      
      inline def setPkeyUndefined: Self = StObject.set(x, "pkey", js.undefined)
    }
  }
  
  trait Signers
    extends StObject
       with TransactionProps {
    
    var addressMap: js.UndefOr[typings.onflowFlowJsTesting.srcAccountMod.AddressMap] = js.undefined
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var signers: js.Array[Address | SignerInfo]
  }
  object Signers {
    
    inline def apply(code: String, signers: js.Array[Address | SignerInfo]): Signers = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], signers = signers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Signers]
    }
    
    extension [Self <: Signers](x: Self) {
      
      inline def setAddressMap(value: typings.onflowFlowJsTesting.srcAccountMod.AddressMap): Self = StObject.set(x, "addressMap", value.asInstanceOf[js.Any])
      
      inline def setAddressMapUndefined: Self = StObject.set(x, "addressMap", js.undefined)
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSigners(value: js.Array[Address | SignerInfo]): Self = StObject.set(x, "signers", value.asInstanceOf[js.Any])
      
      inline def setSignersVarargs(value: (Address | SignerInfo)*): Self = StObject.set(x, "signers", js.Array(value*))
    }
  }
  
  trait Transformers
    extends StObject
       with ScriptProps {
    
    var args: js.UndefOr[js.Array[Any]] = js.undefined
    
    var code: js.UndefOr[String] = js.undefined
    
    var name: String
    
    var transformers: js.UndefOr[js.Array[CadenceTransformer]] = js.undefined
  }
  object Transformers {
    
    inline def apply(name: String): Transformers = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transformers]
    }
    
    extension [Self <: Transformers](x: Self) {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTransformers(value: js.Array[CadenceTransformer]): Self = StObject.set(x, "transformers", value.asInstanceOf[js.Any])
      
      inline def setTransformersUndefined: Self = StObject.set(x, "transformers", js.undefined)
      
      inline def setTransformersVarargs(value: CadenceTransformer*): Self = StObject.set(x, "transformers", js.Array(value*))
    }
  }
}
