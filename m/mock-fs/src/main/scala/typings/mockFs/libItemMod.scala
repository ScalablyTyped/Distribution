package typings.mockFs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libItemMod {
  
  /**
    * A filesystem item.
    */
  @JSImport("mock-fs/lib/item", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Item {
    
    /**  Returns whether the current user has execute permission. */
    /* CompleteClass */
    override def canExecute(): Boolean = js.native
    
    /** Returns whether the current user has read permission. */
    /* CompleteClass */
    override def canRead(): Boolean = js.native
    
    /** Returns whether the current user has write permission. */
    /* CompleteClass */
    override def canWrite(): Boolean = js.native
    
    /** Get access time. */
    /* CompleteClass */
    override def getATime(): js.Date = js.native
    
    /** Get birth time. */
    /* CompleteClass */
    override def getBirthtime(): js.Date = js.native
    
    /** Get change time. */
    /* CompleteClass */
    override def getCTime(): js.Date = js.native
    
    /** Get group id. */
    /* CompleteClass */
    override def getGid(): Double = js.native
    
    /** Get modification time. */
    /* CompleteClass */
    override def getMTime(): js.Date = js.native
    
    /** Get mode (permission only, e.g 0666). */
    /* CompleteClass */
    override def getMode(): Double = js.native
    
    /** Get item stats. */
    /* CompleteClass */
    override def getStats(): Stats = js.native
    
    /** Get user id. */
    /* CompleteClass */
    override def getUid(): Double = js.native
    
    /** Set access time. */
    /* CompleteClass */
    override def setATime(atime: js.Date): Unit = js.native
    
    /** Set birth time. */
    /* CompleteClass */
    override def setBirthtime(birthtime: js.Date): Unit = js.native
    
    /** Set change time. */
    /* CompleteClass */
    override def setCTime(ctime: js.Date): Unit = js.native
    
    /** Set group id. */
    /* CompleteClass */
    override def setGid(gid: Double): Unit = js.native
    
    /** Set modification time. */
    /* CompleteClass */
    override def setMTime(mtime: js.Date): Unit = js.native
    
    /** Set mode (permission only, e.g 0666). */
    /* CompleteClass */
    override def setMode(mode: Double): Unit = js.native
    
    /** Set user id. */
    /* CompleteClass */
    override def setUid(uid: Double): Unit = js.native
  }
  
  trait ExtendedStats
    extends StObject
       with Stats {
    
    var blocks: Double
    
    var mode: Double
    
    var size: Double
  }
  object ExtendedStats {
    
    inline def apply(
      atime: js.Date,
      birthtime: js.Date,
      blksize: Double,
      blocks: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mode: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      size: Double,
      uid: Double
    ): ExtendedStats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendedStats]
    }
    
    extension [Self <: ExtendedStats](x: Self) {
      
      inline def setBlocks(value: Double): Self = StObject.set(x, "blocks", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * A filesystem item.
    */
  trait Item extends StObject {
    
    /**  Returns whether the current user has execute permission. */
    def canExecute(): Boolean
    
    /** Returns whether the current user has read permission. */
    def canRead(): Boolean
    
    /** Returns whether the current user has write permission. */
    def canWrite(): Boolean
    
    /** Get access time. */
    def getATime(): js.Date
    
    /** Get birth time. */
    def getBirthtime(): js.Date
    
    /** Get change time. */
    def getCTime(): js.Date
    
    /** Get group id. */
    def getGid(): Double
    
    /** Get modification time. */
    def getMTime(): js.Date
    
    /** Get mode (permission only, e.g 0666). */
    def getMode(): Double
    
    /** Get item stats. */
    def getStats(): Stats
    
    /** Get user id. */
    def getUid(): Double
    
    /** Set access time. */
    def setATime(atime: js.Date): Unit
    
    /** Set birth time. */
    def setBirthtime(birthtime: js.Date): Unit
    
    /** Set change time. */
    def setCTime(ctime: js.Date): Unit
    
    /** Set group id. */
    def setGid(gid: Double): Unit
    
    /** Set modification time. */
    def setMTime(mtime: js.Date): Unit
    
    /** Set mode (permission only, e.g 0666). */
    def setMode(mode: Double): Unit
    
    /** Set user id. */
    def setUid(uid: Double): Unit
  }
  object Item {
    
    inline def apply(
      canExecute: () => Boolean,
      canRead: () => Boolean,
      canWrite: () => Boolean,
      getATime: () => js.Date,
      getBirthtime: () => js.Date,
      getCTime: () => js.Date,
      getGid: () => Double,
      getMTime: () => js.Date,
      getMode: () => Double,
      getStats: () => Stats,
      getUid: () => Double,
      setATime: js.Date => Unit,
      setBirthtime: js.Date => Unit,
      setCTime: js.Date => Unit,
      setGid: Double => Unit,
      setMTime: js.Date => Unit,
      setMode: Double => Unit,
      setUid: Double => Unit
    ): Item = {
      val __obj = js.Dynamic.literal(canExecute = js.Any.fromFunction0(canExecute), canRead = js.Any.fromFunction0(canRead), canWrite = js.Any.fromFunction0(canWrite), getATime = js.Any.fromFunction0(getATime), getBirthtime = js.Any.fromFunction0(getBirthtime), getCTime = js.Any.fromFunction0(getCTime), getGid = js.Any.fromFunction0(getGid), getMTime = js.Any.fromFunction0(getMTime), getMode = js.Any.fromFunction0(getMode), getStats = js.Any.fromFunction0(getStats), getUid = js.Any.fromFunction0(getUid), setATime = js.Any.fromFunction1(setATime), setBirthtime = js.Any.fromFunction1(setBirthtime), setCTime = js.Any.fromFunction1(setCTime), setGid = js.Any.fromFunction1(setGid), setMTime = js.Any.fromFunction1(setMTime), setMode = js.Any.fromFunction1(setMode), setUid = js.Any.fromFunction1(setUid))
      __obj.asInstanceOf[Item]
    }
    
    extension [Self <: Item](x: Self) {
      
      inline def setCanExecute(value: () => Boolean): Self = StObject.set(x, "canExecute", js.Any.fromFunction0(value))
      
      inline def setCanRead(value: () => Boolean): Self = StObject.set(x, "canRead", js.Any.fromFunction0(value))
      
      inline def setCanWrite(value: () => Boolean): Self = StObject.set(x, "canWrite", js.Any.fromFunction0(value))
      
      inline def setGetATime(value: () => js.Date): Self = StObject.set(x, "getATime", js.Any.fromFunction0(value))
      
      inline def setGetBirthtime(value: () => js.Date): Self = StObject.set(x, "getBirthtime", js.Any.fromFunction0(value))
      
      inline def setGetCTime(value: () => js.Date): Self = StObject.set(x, "getCTime", js.Any.fromFunction0(value))
      
      inline def setGetGid(value: () => Double): Self = StObject.set(x, "getGid", js.Any.fromFunction0(value))
      
      inline def setGetMTime(value: () => js.Date): Self = StObject.set(x, "getMTime", js.Any.fromFunction0(value))
      
      inline def setGetMode(value: () => Double): Self = StObject.set(x, "getMode", js.Any.fromFunction0(value))
      
      inline def setGetStats(value: () => Stats): Self = StObject.set(x, "getStats", js.Any.fromFunction0(value))
      
      inline def setGetUid(value: () => Double): Self = StObject.set(x, "getUid", js.Any.fromFunction0(value))
      
      inline def setSetATime(value: js.Date => Unit): Self = StObject.set(x, "setATime", js.Any.fromFunction1(value))
      
      inline def setSetBirthtime(value: js.Date => Unit): Self = StObject.set(x, "setBirthtime", js.Any.fromFunction1(value))
      
      inline def setSetCTime(value: js.Date => Unit): Self = StObject.set(x, "setCTime", js.Any.fromFunction1(value))
      
      inline def setSetGid(value: Double => Unit): Self = StObject.set(x, "setGid", js.Any.fromFunction1(value))
      
      inline def setSetMTime(value: js.Date => Unit): Self = StObject.set(x, "setMTime", js.Any.fromFunction1(value))
      
      inline def setSetMode(value: Double => Unit): Self = StObject.set(x, "setMode", js.Any.fromFunction1(value))
      
      inline def setSetUid(value: Double => Unit): Self = StObject.set(x, "setUid", js.Any.fromFunction1(value))
    }
  }
  
  trait Stats extends StObject {
    
    var atime: js.Date
    
    var birthtime: js.Date
    
    var blksize: Double
    
    var ctime: js.Date
    
    var dev: Double
    
    var gid: Double
    
    var ino: Double
    
    var mtime: js.Date
    
    var nlink: Double
    
    var rdev: Double
    
    var uid: Double
  }
  object Stats {
    
    inline def apply(
      atime: js.Date,
      birthtime: js.Date,
      blksize: Double,
      ctime: js.Date,
      dev: Double,
      gid: Double,
      ino: Double,
      mtime: js.Date,
      nlink: Double,
      rdev: Double,
      uid: Double
    ): Stats = {
      val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setAtime(value: js.Date): Self = StObject.set(x, "atime", value.asInstanceOf[js.Any])
      
      inline def setBirthtime(value: js.Date): Self = StObject.set(x, "birthtime", value.asInstanceOf[js.Any])
      
      inline def setBlksize(value: Double): Self = StObject.set(x, "blksize", value.asInstanceOf[js.Any])
      
      inline def setCtime(value: js.Date): Self = StObject.set(x, "ctime", value.asInstanceOf[js.Any])
      
      inline def setDev(value: Double): Self = StObject.set(x, "dev", value.asInstanceOf[js.Any])
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setIno(value: Double): Self = StObject.set(x, "ino", value.asInstanceOf[js.Any])
      
      inline def setMtime(value: js.Date): Self = StObject.set(x, "mtime", value.asInstanceOf[js.Any])
      
      inline def setNlink(value: Double): Self = StObject.set(x, "nlink", value.asInstanceOf[js.Any])
      
      inline def setRdev(value: Double): Self = StObject.set(x, "rdev", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
}
