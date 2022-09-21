package typings.parseListing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("parse-listing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait access extends StObject
  @JSImport("parse-listing", "access")
  @js.native
  object access extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[access & Double] = js.native
    
    @js.native
    sealed trait GROUP_ACCESS
      extends StObject
         with access
    /* 1 */ val GROUP_ACCESS: typings.parseListing.mod.access.GROUP_ACCESS & Double = js.native
    
    @js.native
    sealed trait USER_ACCESS
      extends StObject
         with access
    /* 0 */ val USER_ACCESS: typings.parseListing.mod.access.USER_ACCESS & Double = js.native
    
    @js.native
    sealed trait WORLD_ACCESS
      extends StObject
         with access
    /* 2 */ val WORLD_ACCESS: typings.parseListing.mod.access.WORLD_ACCESS & Double = js.native
  }
  
  @js.native
  sealed trait nodeTypes extends StObject
  @JSImport("parse-listing", "nodeTypes")
  @js.native
  object nodeTypes extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[nodeTypes & Double] = js.native
    
    @js.native
    sealed trait DIRECTORY_TYPE
      extends StObject
         with nodeTypes
    /* 1 */ val DIRECTORY_TYPE: typings.parseListing.mod.nodeTypes.DIRECTORY_TYPE & Double = js.native
    
    @js.native
    sealed trait FILE_TYPE
      extends StObject
         with nodeTypes
    /* 0 */ val FILE_TYPE: typings.parseListing.mod.nodeTypes.FILE_TYPE & Double = js.native
    
    @js.native
    sealed trait SYMBOLIC_LINK_TYPE
      extends StObject
         with nodeTypes
    /* 2 */ val SYMBOLIC_LINK_TYPE: typings.parseListing.mod.nodeTypes.SYMBOLIC_LINK_TYPE & Double = js.native
    
    @js.native
    sealed trait UNKNOWN_TYPE
      extends StObject
         with nodeTypes
    /* 3 */ val UNKNOWN_TYPE: typings.parseListing.mod.nodeTypes.UNKNOWN_TYPE & Double = js.native
  }
  
  inline def parseEntries(entries: String, callback: ParsingCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEntries")(entries.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseEntries(entries: js.Array[String], callback: ParsingCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseEntries")(entries.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def parseEntry(entry: String): File | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseEntry")(entry.asInstanceOf[js.Any]).asInstanceOf[File | Null]
  
  inline def parseFtpEntries(listing: String, callback: ParsingCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFtpEntries")(listing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parseFtpEntries(listing: js.Array[String], callback: ParsingCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parseFtpEntries")(listing.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  sealed trait permissions extends StObject
  @JSImport("parse-listing", "permissions")
  @js.native
  object permissions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[permissions & Double] = js.native
    
    @js.native
    sealed trait EXECUTE_PERMISSION
      extends StObject
         with permissions
    /* 2 */ val EXECUTE_PERMISSION: typings.parseListing.mod.permissions.EXECUTE_PERMISSION & Double = js.native
    
    @js.native
    sealed trait READ_PERMISSION
      extends StObject
         with permissions
    /* 0 */ val READ_PERMISSION: typings.parseListing.mod.permissions.READ_PERMISSION & Double = js.native
    
    @js.native
    sealed trait WRITE_PERMISSION
      extends StObject
         with permissions
    /* 1 */ val WRITE_PERMISSION: typings.parseListing.mod.permissions.WRITE_PERMISSION & Double = js.native
  }
  
  trait File extends StObject {
    
    var group: js.UndefOr[String] = js.undefined
    
    var groupPermissions: js.UndefOr[Permissions_] = js.undefined
    
    var name: String
    
    var otherPermissions: js.UndefOr[Permissions_] = js.undefined
    
    var owner: js.UndefOr[String] = js.undefined
    
    var size: String
    
    var time: Double
    
    var `type`: nodeTypes
    
    var userPermissions: js.UndefOr[Permissions_] = js.undefined
  }
  object File {
    
    inline def apply(name: String, size: String, time: Double, `type`: nodeTypes): File = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupPermissions(value: Permissions_): Self = StObject.set(x, "groupPermissions", value.asInstanceOf[js.Any])
      
      inline def setGroupPermissionsUndefined: Self = StObject.set(x, "groupPermissions", js.undefined)
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOtherPermissions(value: Permissions_): Self = StObject.set(x, "otherPermissions", value.asInstanceOf[js.Any])
      
      inline def setOtherPermissionsUndefined: Self = StObject.set(x, "otherPermissions", js.undefined)
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      inline def setType(value: nodeTypes): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUserPermissions(value: Permissions_): Self = StObject.set(x, "userPermissions", value.asInstanceOf[js.Any])
      
      inline def setUserPermissionsUndefined: Self = StObject.set(x, "userPermissions", js.undefined)
    }
  }
  
  type ParsingCallback = js.Function2[/* err */ js.Error | Null, /* result */ js.Array[File], Unit]
  
  trait Permissions_ extends StObject {
    
    var exec: Boolean
    
    var read: Boolean
    
    var write: Boolean
  }
  object Permissions_ {
    
    inline def apply(exec: Boolean, read: Boolean, write: Boolean): Permissions_ = {
      val __obj = js.Dynamic.literal(exec = exec.asInstanceOf[js.Any], read = read.asInstanceOf[js.Any], write = write.asInstanceOf[js.Any])
      __obj.asInstanceOf[Permissions_]
    }
    
    extension [Self <: Permissions_](x: Self) {
      
      inline def setExec(value: Boolean): Self = StObject.set(x, "exec", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setWrite(value: Boolean): Self = StObject.set(x, "write", value.asInstanceOf[js.Any])
    }
  }
}
