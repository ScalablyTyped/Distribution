package typings.memfs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Atime extends StObject {
  
  var atime: Double
  
  var ctime: Double
  
  var data: String
  
  var gid: Double
  
  var ino: Double
  
  var mode: Double
  
  var mtime: Double
  
  var nlink: Double
  
  var perm: Double
  
  var symlink: js.Array[String]
  
  var uid: Double
}
object Atime {
  
  inline def apply(
    atime: Double,
    ctime: Double,
    data: String,
    gid: Double,
    ino: Double,
    mode: Double,
    mtime: Double,
    nlink: Double,
    perm: Double,
    symlink: js.Array[String],
    uid: Double
  ): Atime = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], perm = perm.asInstanceOf[js.Any], symlink = symlink.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Atime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Atime] (val x: Self) extends AnyVal {
    
    inline def setAtime(value: Double): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
    
    inline def setCtime(value: Double): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
    
    inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
    
    inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setMtime(value: Double): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
    
    inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
    
    inline def setPerm(value: Double): Self = StObject.set(x, "perm", value.asInstanceOf[js.Any])
    
    inline def setSymlink(value: js.Array[String]): Self = StObject.set(x, "symlink", value.asInstanceOf[js.Any])
    
    inline def setSymlinkVarargs(value: String*): Self = StObject.set(x, "symlink", js.Array(value*))
    
    inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
  }
}
