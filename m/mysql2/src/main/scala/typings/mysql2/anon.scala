package typings.mysql2

import typings.mysql2.mod.Connection
import typings.mysql2.mysql2Strings.Field
import typings.mysql2.mysql2Strings.FieldPacket
import typings.mysql2.mysql2Strings.OkPacket
import typings.mysql2.mysql2Strings.ResultSetHeader
import typings.mysql2.mysql2Strings.RowDataPacket
import typings.node.bufferMod.global.Buffer
import typings.node.cryptoMod.KeyLike
import typings.node.cryptoMod.RsaPrivateKey
import typings.node.cryptoMod.RsaPublicKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var name: FieldPacket
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(name = "FieldPacket")
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `0`] (val x: Self) extends AnyVal {
      
      inline def setName(value: FieldPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var name: OkPacket
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(name = "OkPacket")
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `1`] (val x: Self) extends AnyVal {
      
      inline def setName(value: OkPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var name: ResultSetHeader
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(name = "ResultSetHeader")
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `2`] (val x: Self) extends AnyVal {
      
      inline def setName(value: ResultSetHeader): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var name: RowDataPacket
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(name = "RowDataPacket")
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: `3`] (val x: Self) extends AnyVal {
      
      inline def setName(value: RowDataPacket): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Command extends StObject {
    
    var command: String
    
    var connection: Connection
  }
  object Command {
    
    inline def apply(command: String, connection: Connection): Command = {
      val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], connection = connection.asInstanceOf[js.Any])
      __obj.asInstanceOf[Command]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
    }
  }
  
  trait JoinServerPublicKey extends StObject {
    
    var joinServerPublicKey: js.UndefOr[js.Function1[/* data */ Buffer, Unit]] = js.undefined
    
    var serverPublicKey: js.UndefOr[RsaPublicKey | RsaPrivateKey | KeyLike] = js.undefined
  }
  object JoinServerPublicKey {
    
    inline def apply(): JoinServerPublicKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JoinServerPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JoinServerPublicKey] (val x: Self) extends AnyVal {
      
      inline def setJoinServerPublicKey(value: /* data */ Buffer => Unit): Self = StObject.set(x, "joinServerPublicKey", js.Any.fromFunction1(value))
      
      inline def setJoinServerPublicKeyUndefined: Self = StObject.set(x, "joinServerPublicKey", js.undefined)
      
      inline def setServerPublicKey(value: RsaPublicKey | RsaPrivateKey | KeyLike): Self = StObject.set(x, "serverPublicKey", value.asInstanceOf[js.Any])
      
      inline def setServerPublicKeyUndefined: Self = StObject.set(x, "serverPublicKey", js.undefined)
    }
  }
  
  trait JonServerPublicKey extends StObject {
    
    var jonServerPublicKey: js.UndefOr[js.Function1[/* data */ Buffer, Unit]] = js.undefined
    
    var overrideIsSecure: js.UndefOr[Boolean] = js.undefined
    
    var serverPublicKey: js.UndefOr[RsaPublicKey | RsaPrivateKey | KeyLike] = js.undefined
  }
  object JonServerPublicKey {
    
    inline def apply(): JonServerPublicKey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JonServerPublicKey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: JonServerPublicKey] (val x: Self) extends AnyVal {
      
      inline def setJonServerPublicKey(value: /* data */ Buffer => Unit): Self = StObject.set(x, "jonServerPublicKey", js.Any.fromFunction1(value))
      
      inline def setJonServerPublicKeyUndefined: Self = StObject.set(x, "jonServerPublicKey", js.undefined)
      
      inline def setOverrideIsSecure(value: Boolean): Self = StObject.set(x, "overrideIsSecure", value.asInstanceOf[js.Any])
      
      inline def setOverrideIsSecureUndefined: Self = StObject.set(x, "overrideIsSecure", js.undefined)
      
      inline def setServerPublicKey(value: RsaPublicKey | RsaPrivateKey | KeyLike): Self = StObject.set(x, "serverPublicKey", value.asInstanceOf[js.Any])
      
      inline def setServerPublicKeyUndefined: Self = StObject.set(x, "serverPublicKey", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: Field
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal(name = "Field")
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: Field): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Password extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
  }
  object Password {
    
    inline def apply(): Password = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Password]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Password] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait PasswordSha1 extends StObject {
    
    var password: js.UndefOr[String] = js.undefined
    
    var passwordSha1: js.UndefOr[String] = js.undefined
  }
  object PasswordSha1 {
    
    inline def apply(): PasswordSha1 = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PasswordSha1]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PasswordSha1] (val x: Self) extends AnyVal {
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordSha1(value: String): Self = StObject.set(x, "passwordSha1", value.asInstanceOf[js.Any])
      
      inline def setPasswordSha1Undefined: Self = StObject.set(x, "passwordSha1", js.undefined)
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait ToSqlString extends StObject {
    
    def toSqlString(): String
  }
  object ToSqlString {
    
    inline def apply(toSqlString: () => String): ToSqlString = {
      val __obj = js.Dynamic.literal(toSqlString = js.Any.fromFunction0(toSqlString))
      __obj.asInstanceOf[ToSqlString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToSqlString] (val x: Self) extends AnyVal {
      
      inline def setToSqlString(value: () => String): Self = StObject.set(x, "toSqlString", js.Any.fromFunction0(value))
    }
  }
}
