package typings.memfs

import org.scalablytyped.runtime.Instantiable1
import typings.memfs.libNodeMod.Link
import typings.memfs.libNodeMod.Node
import typings.memfs.memfsBooleans.`false`
import typings.memfs.memfsBooleans.`true`
import typings.memfs.memfsStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var throwIfNoEntry: `false`
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(throwIfNoEntry = false)
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    }
  }
  
  trait `1` extends StObject {
    
    var bigint: `false`
    
    var throwIfNoEntry: `false`
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(bigint = false, throwIfNoEntry = false)
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var bigint: `true`
    
    var throwIfNoEntry: `false`
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(bigint = true, throwIfNoEntry = false)
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntry(value: `false`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var bigint: `false`
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(bigint = false)
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    }
  }
  
  trait `4` extends StObject {
    
    var bigint: `true`
  }
  object `4` {
    
    inline def apply(): `4` = {
      val __obj = js.Dynamic.literal(bigint = true)
      __obj.asInstanceOf[`4`]
    }
    
    extension [Self <: `4`](x: Self) {
      
      inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
    }
  }
  
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
    
    extension [Self <: Atime](x: Self) {
      
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
  
  trait Bigint extends StObject {
    
    var bigint: `false`
    
    var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
  }
  object Bigint {
    
    inline def apply(): Bigint = {
      val __obj = js.Dynamic.literal(bigint = false)
      __obj.asInstanceOf[Bigint]
    }
    
    extension [Self <: Bigint](x: Self) {
      
      inline def setBigint(value: `false`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
    }
  }
  
  trait BigintThrowIfNoEntry extends StObject {
    
    var bigint: `true`
    
    var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
  }
  object BigintThrowIfNoEntry {
    
    inline def apply(): BigintThrowIfNoEntry = {
      val __obj = js.Dynamic.literal(bigint = true)
      __obj.asInstanceOf[BigintThrowIfNoEntry]
    }
    
    extension [Self <: BigintThrowIfNoEntry](x: Self) {
      
      inline def setBigint(value: `true`): Self = StObject.set(x, "bigint", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
    }
  }
  
  trait COPYFILEEXCL extends StObject {
    
    var COPYFILE_EXCL: Double
    
    var COPYFILE_FICLONE: Double
    
    var COPYFILE_FICLONE_FORCE: Double
    
    var F_OK: Double
    
    var O_APPEND: Double
    
    var O_CREAT: Double
    
    var O_DIRECT: Double
    
    var O_DIRECTORY: Double
    
    var O_EXCL: Double
    
    var O_NOATIME: Double
    
    var O_NOCTTY: Double
    
    var O_NOFOLLOW: Double
    
    var O_NONBLOCK: Double
    
    var O_RDONLY: Double
    
    var O_RDWR: Double
    
    var O_SYNC: Double
    
    var O_TRUNC: Double
    
    var O_WRONLY: Double
    
    var R_OK: Double
    
    var S_IFBLK: Double
    
    var S_IFCHR: Double
    
    var S_IFDIR: Double
    
    var S_IFIFO: Double
    
    var S_IFLNK: Double
    
    var S_IFMT: Double
    
    var S_IFREG: Double
    
    var S_IFSOCK: Double
    
    var S_IRGRP: Double
    
    var S_IROTH: Double
    
    var S_IRUSR: Double
    
    var S_IRWXG: Double
    
    var S_IRWXO: Double
    
    var S_IRWXU: Double
    
    var S_IWGRP: Double
    
    var S_IWOTH: Double
    
    var S_IWUSR: Double
    
    var S_IXGRP: Double
    
    var S_IXOTH: Double
    
    var S_IXUSR: Double
    
    var UV_FS_COPYFILE_EXCL: Double
    
    var UV_FS_COPYFILE_FICLONE: Double
    
    var UV_FS_COPYFILE_FICLONE_FORCE: Double
    
    var UV_FS_SYMLINK_DIR: Double
    
    var UV_FS_SYMLINK_JUNCTION: Double
    
    var W_OK: Double
    
    var X_OK: Double
  }
  object COPYFILEEXCL {
    
    inline def apply(
      COPYFILE_EXCL: Double,
      COPYFILE_FICLONE: Double,
      COPYFILE_FICLONE_FORCE: Double,
      F_OK: Double,
      O_APPEND: Double,
      O_CREAT: Double,
      O_DIRECT: Double,
      O_DIRECTORY: Double,
      O_EXCL: Double,
      O_NOATIME: Double,
      O_NOCTTY: Double,
      O_NOFOLLOW: Double,
      O_NONBLOCK: Double,
      O_RDONLY: Double,
      O_RDWR: Double,
      O_SYNC: Double,
      O_TRUNC: Double,
      O_WRONLY: Double,
      R_OK: Double,
      S_IFBLK: Double,
      S_IFCHR: Double,
      S_IFDIR: Double,
      S_IFIFO: Double,
      S_IFLNK: Double,
      S_IFMT: Double,
      S_IFREG: Double,
      S_IFSOCK: Double,
      S_IRGRP: Double,
      S_IROTH: Double,
      S_IRUSR: Double,
      S_IRWXG: Double,
      S_IRWXO: Double,
      S_IRWXU: Double,
      S_IWGRP: Double,
      S_IWOTH: Double,
      S_IWUSR: Double,
      S_IXGRP: Double,
      S_IXOTH: Double,
      S_IXUSR: Double,
      UV_FS_COPYFILE_EXCL: Double,
      UV_FS_COPYFILE_FICLONE: Double,
      UV_FS_COPYFILE_FICLONE_FORCE: Double,
      UV_FS_SYMLINK_DIR: Double,
      UV_FS_SYMLINK_JUNCTION: Double,
      W_OK: Double,
      X_OK: Double
    ): COPYFILEEXCL = {
      val __obj = js.Dynamic.literal(COPYFILE_EXCL = COPYFILE_EXCL.asInstanceOf[js.Any], COPYFILE_FICLONE = COPYFILE_FICLONE.asInstanceOf[js.Any], COPYFILE_FICLONE_FORCE = COPYFILE_FICLONE_FORCE.asInstanceOf[js.Any], F_OK = F_OK.asInstanceOf[js.Any], O_APPEND = O_APPEND.asInstanceOf[js.Any], O_CREAT = O_CREAT.asInstanceOf[js.Any], O_DIRECT = O_DIRECT.asInstanceOf[js.Any], O_DIRECTORY = O_DIRECTORY.asInstanceOf[js.Any], O_EXCL = O_EXCL.asInstanceOf[js.Any], O_NOATIME = O_NOATIME.asInstanceOf[js.Any], O_NOCTTY = O_NOCTTY.asInstanceOf[js.Any], O_NOFOLLOW = O_NOFOLLOW.asInstanceOf[js.Any], O_NONBLOCK = O_NONBLOCK.asInstanceOf[js.Any], O_RDONLY = O_RDONLY.asInstanceOf[js.Any], O_RDWR = O_RDWR.asInstanceOf[js.Any], O_SYNC = O_SYNC.asInstanceOf[js.Any], O_TRUNC = O_TRUNC.asInstanceOf[js.Any], O_WRONLY = O_WRONLY.asInstanceOf[js.Any], R_OK = R_OK.asInstanceOf[js.Any], S_IFBLK = S_IFBLK.asInstanceOf[js.Any], S_IFCHR = S_IFCHR.asInstanceOf[js.Any], S_IFDIR = S_IFDIR.asInstanceOf[js.Any], S_IFIFO = S_IFIFO.asInstanceOf[js.Any], S_IFLNK = S_IFLNK.asInstanceOf[js.Any], S_IFMT = S_IFMT.asInstanceOf[js.Any], S_IFREG = S_IFREG.asInstanceOf[js.Any], S_IFSOCK = S_IFSOCK.asInstanceOf[js.Any], S_IRGRP = S_IRGRP.asInstanceOf[js.Any], S_IROTH = S_IROTH.asInstanceOf[js.Any], S_IRUSR = S_IRUSR.asInstanceOf[js.Any], S_IRWXG = S_IRWXG.asInstanceOf[js.Any], S_IRWXO = S_IRWXO.asInstanceOf[js.Any], S_IRWXU = S_IRWXU.asInstanceOf[js.Any], S_IWGRP = S_IWGRP.asInstanceOf[js.Any], S_IWOTH = S_IWOTH.asInstanceOf[js.Any], S_IWUSR = S_IWUSR.asInstanceOf[js.Any], S_IXGRP = S_IXGRP.asInstanceOf[js.Any], S_IXOTH = S_IXOTH.asInstanceOf[js.Any], S_IXUSR = S_IXUSR.asInstanceOf[js.Any], UV_FS_COPYFILE_EXCL = UV_FS_COPYFILE_EXCL.asInstanceOf[js.Any], UV_FS_COPYFILE_FICLONE = UV_FS_COPYFILE_FICLONE.asInstanceOf[js.Any], UV_FS_COPYFILE_FICLONE_FORCE = UV_FS_COPYFILE_FICLONE_FORCE.asInstanceOf[js.Any], UV_FS_SYMLINK_DIR = UV_FS_SYMLINK_DIR.asInstanceOf[js.Any], UV_FS_SYMLINK_JUNCTION = UV_FS_SYMLINK_JUNCTION.asInstanceOf[js.Any], W_OK = W_OK.asInstanceOf[js.Any], X_OK = X_OK.asInstanceOf[js.Any])
      __obj.asInstanceOf[COPYFILEEXCL]
    }
    
    extension [Self <: COPYFILEEXCL](x: Self) {
      
      inline def setCOPYFILE_EXCL(value: Double): Self = StObject.set(x, "COPYFILE_EXCL", value.asInstanceOf[js.Any])
      
      inline def setCOPYFILE_FICLONE(value: Double): Self = StObject.set(x, "COPYFILE_FICLONE", value.asInstanceOf[js.Any])
      
      inline def setCOPYFILE_FICLONE_FORCE(value: Double): Self = StObject.set(x, "COPYFILE_FICLONE_FORCE", value.asInstanceOf[js.Any])
      
      inline def setF_OK(value: Double): Self = StObject.set(x, "F_OK", value.asInstanceOf[js.Any])
      
      inline def setO_APPEND(value: Double): Self = StObject.set(x, "O_APPEND", value.asInstanceOf[js.Any])
      
      inline def setO_CREAT(value: Double): Self = StObject.set(x, "O_CREAT", value.asInstanceOf[js.Any])
      
      inline def setO_DIRECT(value: Double): Self = StObject.set(x, "O_DIRECT", value.asInstanceOf[js.Any])
      
      inline def setO_DIRECTORY(value: Double): Self = StObject.set(x, "O_DIRECTORY", value.asInstanceOf[js.Any])
      
      inline def setO_EXCL(value: Double): Self = StObject.set(x, "O_EXCL", value.asInstanceOf[js.Any])
      
      inline def setO_NOATIME(value: Double): Self = StObject.set(x, "O_NOATIME", value.asInstanceOf[js.Any])
      
      inline def setO_NOCTTY(value: Double): Self = StObject.set(x, "O_NOCTTY", value.asInstanceOf[js.Any])
      
      inline def setO_NOFOLLOW(value: Double): Self = StObject.set(x, "O_NOFOLLOW", value.asInstanceOf[js.Any])
      
      inline def setO_NONBLOCK(value: Double): Self = StObject.set(x, "O_NONBLOCK", value.asInstanceOf[js.Any])
      
      inline def setO_RDONLY(value: Double): Self = StObject.set(x, "O_RDONLY", value.asInstanceOf[js.Any])
      
      inline def setO_RDWR(value: Double): Self = StObject.set(x, "O_RDWR", value.asInstanceOf[js.Any])
      
      inline def setO_SYNC(value: Double): Self = StObject.set(x, "O_SYNC", value.asInstanceOf[js.Any])
      
      inline def setO_TRUNC(value: Double): Self = StObject.set(x, "O_TRUNC", value.asInstanceOf[js.Any])
      
      inline def setO_WRONLY(value: Double): Self = StObject.set(x, "O_WRONLY", value.asInstanceOf[js.Any])
      
      inline def setR_OK(value: Double): Self = StObject.set(x, "R_OK", value.asInstanceOf[js.Any])
      
      inline def setS_IFBLK(value: Double): Self = StObject.set(x, "S_IFBLK", value.asInstanceOf[js.Any])
      
      inline def setS_IFCHR(value: Double): Self = StObject.set(x, "S_IFCHR", value.asInstanceOf[js.Any])
      
      inline def setS_IFDIR(value: Double): Self = StObject.set(x, "S_IFDIR", value.asInstanceOf[js.Any])
      
      inline def setS_IFIFO(value: Double): Self = StObject.set(x, "S_IFIFO", value.asInstanceOf[js.Any])
      
      inline def setS_IFLNK(value: Double): Self = StObject.set(x, "S_IFLNK", value.asInstanceOf[js.Any])
      
      inline def setS_IFMT(value: Double): Self = StObject.set(x, "S_IFMT", value.asInstanceOf[js.Any])
      
      inline def setS_IFREG(value: Double): Self = StObject.set(x, "S_IFREG", value.asInstanceOf[js.Any])
      
      inline def setS_IFSOCK(value: Double): Self = StObject.set(x, "S_IFSOCK", value.asInstanceOf[js.Any])
      
      inline def setS_IRGRP(value: Double): Self = StObject.set(x, "S_IRGRP", value.asInstanceOf[js.Any])
      
      inline def setS_IROTH(value: Double): Self = StObject.set(x, "S_IROTH", value.asInstanceOf[js.Any])
      
      inline def setS_IRUSR(value: Double): Self = StObject.set(x, "S_IRUSR", value.asInstanceOf[js.Any])
      
      inline def setS_IRWXG(value: Double): Self = StObject.set(x, "S_IRWXG", value.asInstanceOf[js.Any])
      
      inline def setS_IRWXO(value: Double): Self = StObject.set(x, "S_IRWXO", value.asInstanceOf[js.Any])
      
      inline def setS_IRWXU(value: Double): Self = StObject.set(x, "S_IRWXU", value.asInstanceOf[js.Any])
      
      inline def setS_IWGRP(value: Double): Self = StObject.set(x, "S_IWGRP", value.asInstanceOf[js.Any])
      
      inline def setS_IWOTH(value: Double): Self = StObject.set(x, "S_IWOTH", value.asInstanceOf[js.Any])
      
      inline def setS_IWUSR(value: Double): Self = StObject.set(x, "S_IWUSR", value.asInstanceOf[js.Any])
      
      inline def setS_IXGRP(value: Double): Self = StObject.set(x, "S_IXGRP", value.asInstanceOf[js.Any])
      
      inline def setS_IXOTH(value: Double): Self = StObject.set(x, "S_IXOTH", value.asInstanceOf[js.Any])
      
      inline def setS_IXUSR(value: Double): Self = StObject.set(x, "S_IXUSR", value.asInstanceOf[js.Any])
      
      inline def setUV_FS_COPYFILE_EXCL(value: Double): Self = StObject.set(x, "UV_FS_COPYFILE_EXCL", value.asInstanceOf[js.Any])
      
      inline def setUV_FS_COPYFILE_FICLONE(value: Double): Self = StObject.set(x, "UV_FS_COPYFILE_FICLONE", value.asInstanceOf[js.Any])
      
      inline def setUV_FS_COPYFILE_FICLONE_FORCE(value: Double): Self = StObject.set(x, "UV_FS_COPYFILE_FICLONE_FORCE", value.asInstanceOf[js.Any])
      
      inline def setUV_FS_SYMLINK_DIR(value: Double): Self = StObject.set(x, "UV_FS_SYMLINK_DIR", value.asInstanceOf[js.Any])
      
      inline def setUV_FS_SYMLINK_JUNCTION(value: Double): Self = StObject.set(x, "UV_FS_SYMLINK_JUNCTION", value.asInstanceOf[js.Any])
      
      inline def setW_OK(value: Double): Self = StObject.set(x, "W_OK", value.asInstanceOf[js.Any])
      
      inline def setX_OK(value: Double): Self = StObject.set(x, "X_OK", value.asInstanceOf[js.Any])
    }
  }
  
  trait Children extends StObject {
    
    var children: js.Array[String]
    
    var ino: Double
    
    var steps: js.Array[String]
  }
  object Children {
    
    inline def apply(children: js.Array[String], ino: Double, steps: js.Array[String]): Children = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
      __obj.asInstanceOf[Children]
    }
    
    extension [Self <: Children](x: Self) {
      
      inline def setChildren(value: js.Array[String]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: String*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setSteps(value: js.Array[String]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
      
      inline def setStepsVarargs(value: String*): Self = StObject.set(x, "steps", js.Array(value*))
    }
  }
  
  trait File extends StObject {
    
    var File: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File]
    
    var Link: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.Link]
    
    var Node: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.Node]
  }
  object File {
    
    inline def apply(
      File: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File],
      Link: Instantiable1[/* args (repeated) */ Any, Link],
      Node: Instantiable1[/* args (repeated) */ Any, Node]
    ): File = {
      val __obj = js.Dynamic.literal(File = File.asInstanceOf[js.Any], Link = Link.asInstanceOf[js.Any], Node = Node.asInstanceOf[js.Any])
      __obj.asInstanceOf[File]
    }
    
    extension [Self <: File](x: Self) {
      
      inline def setFile(value: Instantiable1[/* args (repeated) */ Any, typings.memfs.libNodeMod.File]): Self = StObject.set(x, "File", value.asInstanceOf[js.Any])
      
      inline def setLink(value: Instantiable1[/* args (repeated) */ Any, Link]): Self = StObject.set(x, "Link", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Instantiable1[/* args (repeated) */ Any, Node]): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    }
  }
  
  trait ThrowIfNoEntry extends StObject {
    
    var throwIfNoEntry: js.UndefOr[`true`] = js.undefined
  }
  object ThrowIfNoEntry {
    
    inline def apply(): ThrowIfNoEntry = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThrowIfNoEntry]
    }
    
    extension [Self <: ThrowIfNoEntry](x: Self) {
      
      inline def setThrowIfNoEntry(value: `true`): Self = StObject.set(x, "throwIfNoEntry", value.asInstanceOf[js.Any])
      
      inline def setThrowIfNoEntryUndefined: Self = StObject.set(x, "throwIfNoEntry", js.undefined)
    }
  }
  
  @js.native
  trait ToPrimitive extends StObject {
    
    @JSName(js.Symbol.toPrimitive)
    var toPrimitive: js.Function1[string, String] = js.native
  }
  
  trait ValueOf extends StObject
}
