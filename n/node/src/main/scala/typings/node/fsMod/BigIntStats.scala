package typings.node.fsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntStats
  extends StObject
     with StatsBase[js.BigInt] {
  
  var atimeNs: js.BigInt
  
  var birthtimeNs: js.BigInt
  
  var ctimeNs: js.BigInt
  
  var mtimeNs: js.BigInt
}
object BigIntStats {
  
  inline def apply(
    atime: js.Date,
    atimeMs: js.BigInt,
    atimeNs: js.BigInt,
    birthtime: js.Date,
    birthtimeMs: js.BigInt,
    birthtimeNs: js.BigInt,
    blksize: js.BigInt,
    blocks: js.BigInt,
    ctime: js.Date,
    ctimeMs: js.BigInt,
    ctimeNs: js.BigInt,
    dev: js.BigInt,
    gid: js.BigInt,
    ino: js.BigInt,
    isBlockDevice: () => Boolean,
    isCharacterDevice: () => Boolean,
    isDirectory: () => Boolean,
    isFIFO: () => Boolean,
    isFile: () => Boolean,
    isSocket: () => Boolean,
    isSymbolicLink: () => Boolean,
    mode: js.BigInt,
    mtime: js.Date,
    mtimeMs: js.BigInt,
    mtimeNs: js.BigInt,
    nlink: js.BigInt,
    rdev: js.BigInt,
    size: js.BigInt,
    uid: js.BigInt
  ): BigIntStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], atimeNs = atimeNs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], birthtimeNs = birthtimeNs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], ctimeNs = ctimeNs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], isBlockDevice = js.Any.fromFunction0(isBlockDevice), isCharacterDevice = js.Any.fromFunction0(isCharacterDevice), isDirectory = js.Any.fromFunction0(isDirectory), isFIFO = js.Any.fromFunction0(isFIFO), isFile = js.Any.fromFunction0(isFile), isSocket = js.Any.fromFunction0(isSocket), isSymbolicLink = js.Any.fromFunction0(isSymbolicLink), mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], mtimeNs = mtimeNs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[BigIntStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BigIntStats] (val x: Self) extends AnyVal {
    
    inline def setAtimeNs(value: js.BigInt): Self = StObject.set(x, "atimeNs", value.asInstanceOf[js.Any])
    
    inline def setBirthtimeNs(value: js.BigInt): Self = StObject.set(x, "birthtimeNs", value.asInstanceOf[js.Any])
    
    inline def setCtimeNs(value: js.BigInt): Self = StObject.set(x, "ctimeNs", value.asInstanceOf[js.Any])
    
    inline def setMtimeNs(value: js.BigInt): Self = StObject.set(x, "mtimeNs", value.asInstanceOf[js.Any])
  }
}
