package typings.posix

import typings.posix.anon.Hard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("posix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chroot(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("chroot")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def closelog(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("closelog")().asInstanceOf[Unit]
  
  inline def getegid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getegid")().asInstanceOf[Double]
  
  inline def geteuid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("geteuid")().asInstanceOf[Double]
  
  inline def getgid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getgid")().asInstanceOf[Double]
  
  inline def getgrnam(group: String): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("getgrnam")(group.asInstanceOf[js.Any]).asInstanceOf[Group]
  inline def getgrnam(group: Double): Group = ^.asInstanceOf[js.Dynamic].applyDynamic("getgrnam")(group.asInstanceOf[js.Any]).asInstanceOf[Group]
  
  inline def gethostname(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("gethostname")().asInstanceOf[String]
  
  inline def getpgid(pid: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getpgid")(pid.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getpgrp(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getpgrp")().asInstanceOf[Double]
  
  inline def getppid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getppid")().asInstanceOf[Double]
  
  inline def getpwnam(user: String): Passwd = ^.asInstanceOf[js.Dynamic].applyDynamic("getpwnam")(user.asInstanceOf[js.Any]).asInstanceOf[Passwd]
  inline def getpwnam(user: Double): Passwd = ^.asInstanceOf[js.Dynamic].applyDynamic("getpwnam")(user.asInstanceOf[js.Any]).asInstanceOf[Passwd]
  
  inline def getrlimit(resource: Resource): Limit = ^.asInstanceOf[js.Dynamic].applyDynamic("getrlimit")(resource.asInstanceOf[js.Any]).asInstanceOf[Limit]
  
  inline def getuid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getuid")().asInstanceOf[Double]
  
  @JSImport("posix", "initgroups")
  @js.native
  val initgroups: js.UndefOr[js.Function2[/* user */ String, /* group */ Double | String, Unit]] = js.native
  
  inline def openlog(ident: String, option: LogOption, facility: Facility): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("openlog")(ident.asInstanceOf[js.Any], option.asInstanceOf[js.Any], facility.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setegid(gid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setegid")(gid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setegid(gid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setegid")(gid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def seteuid(uid: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seteuid")(uid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def seteuid(uid: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("seteuid")(uid.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setgid(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setgid")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setgid(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setgid")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def sethostname(hostname: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("sethostname")(hostname.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setlogmask(mask: PriorityMask): LogMask = ^.asInstanceOf[js.Dynamic].applyDynamic("setlogmask")(mask.asInstanceOf[js.Any]).asInstanceOf[LogMask]
  
  inline def setpgid(pid: Double, pgid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setpgid")(pid.asInstanceOf[js.Any], pgid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setregid(rgid: String, egid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setregid")(rgid.asInstanceOf[js.Any], egid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setregid(rgid: String, egid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setregid")(rgid.asInstanceOf[js.Any], egid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setregid(rgid: Double, egid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setregid")(rgid.asInstanceOf[js.Any], egid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setregid(rgid: Double, egid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setregid")(rgid.asInstanceOf[js.Any], egid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setreuid(ruid: String, euid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setreuid")(ruid.asInstanceOf[js.Any], euid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setreuid(ruid: String, euid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setreuid")(ruid.asInstanceOf[js.Any], euid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setreuid(ruid: Double, euid: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setreuid")(ruid.asInstanceOf[js.Any], euid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setreuid(ruid: Double, euid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setreuid")(ruid.asInstanceOf[js.Any], euid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setrlimit(resource: Resource, limit: Hard): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setrlimit")(resource.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setsid(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setsid")().asInstanceOf[Double]
  
  inline def setuid(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setuid")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def setuid(id: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setuid")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("posix", "swapoff")
  @js.native
  val swapoff: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.native
  
  @JSImport("posix", "swapon")
  @js.native
  val swapon: js.UndefOr[js.Function2[/* path */ String, /* swapFlags */ js.UndefOr[SwapFlags], Unit]] = js.native
  
  inline def syslog(priority: Priority, message: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("syslog")(priority.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.posix.posixStrings.auth
    - typings.posix.posixStrings.authpriv
    - typings.posix.posixStrings.cron
    - typings.posix.posixStrings.daemon
    - typings.posix.posixStrings.ftp
    - typings.posix.posixStrings.kern
    - typings.posix.posixStrings.lpr
    - typings.posix.posixStrings.mail
    - typings.posix.posixStrings.news
    - typings.posix.posixStrings.syslog
    - typings.posix.posixStrings.user
    - typings.posix.posixStrings.uucp
    - typings.posix.posixStrings.local0
    - typings.posix.posixStrings.local1
    - typings.posix.posixStrings.local2
    - typings.posix.posixStrings.local3
    - typings.posix.posixStrings.local4
    - typings.posix.posixStrings.local5
    - typings.posix.posixStrings.local6
    - typings.posix.posixStrings.local7
  */
  trait Facility extends StObject
  object Facility {
    
    inline def auth: typings.posix.posixStrings.auth = "auth".asInstanceOf[typings.posix.posixStrings.auth]
    
    inline def authpriv: typings.posix.posixStrings.authpriv = "authpriv".asInstanceOf[typings.posix.posixStrings.authpriv]
    
    inline def cron: typings.posix.posixStrings.cron = "cron".asInstanceOf[typings.posix.posixStrings.cron]
    
    inline def daemon: typings.posix.posixStrings.daemon = "daemon".asInstanceOf[typings.posix.posixStrings.daemon]
    
    inline def ftp: typings.posix.posixStrings.ftp = "ftp".asInstanceOf[typings.posix.posixStrings.ftp]
    
    inline def kern: typings.posix.posixStrings.kern = "kern".asInstanceOf[typings.posix.posixStrings.kern]
    
    inline def local0: typings.posix.posixStrings.local0 = "local0".asInstanceOf[typings.posix.posixStrings.local0]
    
    inline def local1: typings.posix.posixStrings.local1 = "local1".asInstanceOf[typings.posix.posixStrings.local1]
    
    inline def local2: typings.posix.posixStrings.local2 = "local2".asInstanceOf[typings.posix.posixStrings.local2]
    
    inline def local3: typings.posix.posixStrings.local3 = "local3".asInstanceOf[typings.posix.posixStrings.local3]
    
    inline def local4: typings.posix.posixStrings.local4 = "local4".asInstanceOf[typings.posix.posixStrings.local4]
    
    inline def local5: typings.posix.posixStrings.local5 = "local5".asInstanceOf[typings.posix.posixStrings.local5]
    
    inline def local6: typings.posix.posixStrings.local6 = "local6".asInstanceOf[typings.posix.posixStrings.local6]
    
    inline def local7: typings.posix.posixStrings.local7 = "local7".asInstanceOf[typings.posix.posixStrings.local7]
    
    inline def lpr: typings.posix.posixStrings.lpr = "lpr".asInstanceOf[typings.posix.posixStrings.lpr]
    
    inline def mail: typings.posix.posixStrings.mail = "mail".asInstanceOf[typings.posix.posixStrings.mail]
    
    inline def news: typings.posix.posixStrings.news = "news".asInstanceOf[typings.posix.posixStrings.news]
    
    inline def syslog: typings.posix.posixStrings.syslog = "syslog".asInstanceOf[typings.posix.posixStrings.syslog]
    
    inline def user: typings.posix.posixStrings.user = "user".asInstanceOf[typings.posix.posixStrings.user]
    
    inline def uucp: typings.posix.posixStrings.uucp = "uucp".asInstanceOf[typings.posix.posixStrings.uucp]
  }
  
  trait Group extends StObject {
    
    var gid: Double
    
    var members: js.Array[String]
    
    var name: String
    
    var passwd: String
  }
  object Group {
    
    inline def apply(gid: Double, members: js.Array[String], name: String, passwd: String): Group = {
      val __obj = js.Dynamic.literal(gid = gid.asInstanceOf[js.Any], members = members.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passwd = passwd.asInstanceOf[js.Any])
      __obj.asInstanceOf[Group]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Group] (val x: Self) extends AnyVal {
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setMembers(value: js.Array[String]): Self = StObject.set(x, "members", value.asInstanceOf[js.Any])
      
      inline def setMembersVarargs(value: String*): Self = StObject.set(x, "members", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPasswd(value: String): Self = StObject.set(x, "passwd", value.asInstanceOf[js.Any])
    }
  }
  
  trait Limit extends StObject {
    
    var hard: Double | Null
    
    var soft: Double | Null
  }
  object Limit {
    
    inline def apply(): Limit = {
      val __obj = js.Dynamic.literal(hard = null, soft = null)
      __obj.asInstanceOf[Limit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Limit] (val x: Self) extends AnyVal {
      
      inline def setHard(value: Double): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
      
      inline def setHardNull: Self = StObject.set(x, "hard", null)
      
      inline def setSoft(value: Double): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
      
      inline def setSoftNull: Self = StObject.set(x, "soft", null)
    }
  }
  
  trait LogMask extends StObject {
    
    var alert: Boolean
    
    var crit: Boolean
    
    var debug: Boolean
    
    var emerg: Boolean
    
    var err: Boolean
    
    var info: Boolean
    
    var notice: Boolean
    
    var warning: Boolean
  }
  object LogMask {
    
    inline def apply(
      alert: Boolean,
      crit: Boolean,
      debug: Boolean,
      emerg: Boolean,
      err: Boolean,
      info: Boolean,
      notice: Boolean,
      warning: Boolean
    ): LogMask = {
      val __obj = js.Dynamic.literal(alert = alert.asInstanceOf[js.Any], crit = crit.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], emerg = emerg.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], notice = notice.asInstanceOf[js.Any], warning = warning.asInstanceOf[js.Any])
      __obj.asInstanceOf[LogMask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogMask] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: Boolean): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setCrit(value: Boolean): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setEmerg(value: Boolean): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      inline def setErr(value: Boolean): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setNotice(value: Boolean): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setWarning(value: Boolean): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    }
  }
  
  trait LogOption extends StObject {
    
    var cons: js.UndefOr[PosixMask] = js.undefined
    
    var ndelay: js.UndefOr[PosixMask] = js.undefined
    
    var nowait: js.UndefOr[PosixMask] = js.undefined
    
    var odelay: js.UndefOr[PosixMask] = js.undefined
    
    var pid: js.UndefOr[PosixMask] = js.undefined
  }
  object LogOption {
    
    inline def apply(): LogOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LogOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LogOption] (val x: Self) extends AnyVal {
      
      inline def setCons(value: PosixMask): Self = StObject.set(x, "cons", value.asInstanceOf[js.Any])
      
      inline def setConsUndefined: Self = StObject.set(x, "cons", js.undefined)
      
      inline def setNdelay(value: PosixMask): Self = StObject.set(x, "ndelay", value.asInstanceOf[js.Any])
      
      inline def setNdelayUndefined: Self = StObject.set(x, "ndelay", js.undefined)
      
      inline def setNowait(value: PosixMask): Self = StObject.set(x, "nowait", value.asInstanceOf[js.Any])
      
      inline def setNowaitUndefined: Self = StObject.set(x, "nowait", js.undefined)
      
      inline def setOdelay(value: PosixMask): Self = StObject.set(x, "odelay", value.asInstanceOf[js.Any])
      
      inline def setOdelayUndefined: Self = StObject.set(x, "odelay", js.undefined)
      
      inline def setPid(value: PosixMask): Self = StObject.set(x, "pid", value.asInstanceOf[js.Any])
      
      inline def setPidUndefined: Self = StObject.set(x, "pid", js.undefined)
    }
  }
  
  trait Passwd extends StObject {
    
    var dir: String
    
    var gecos: String | Null
    
    var gid: Double
    
    var name: String
    
    var passwd: String
    
    var shell: String
    
    var uid: Double
  }
  object Passwd {
    
    inline def apply(dir: String, gid: Double, name: String, passwd: String, shell: String, uid: Double): Passwd = {
      val __obj = js.Dynamic.literal(dir = dir.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], passwd = passwd.asInstanceOf[js.Any], shell = shell.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any], gecos = null)
      __obj.asInstanceOf[Passwd]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Passwd] (val x: Self) extends AnyVal {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setGecos(value: String): Self = StObject.set(x, "gecos", value.asInstanceOf[js.Any])
      
      inline def setGecosNull: Self = StObject.set(x, "gecos", null)
      
      inline def setGid(value: Double): Self = StObject.set(x, "gid", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPasswd(value: String): Self = StObject.set(x, "passwd", value.asInstanceOf[js.Any])
      
      inline def setShell(value: String): Self = StObject.set(x, "shell", value.asInstanceOf[js.Any])
      
      inline def setUid(value: Double): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typings.posix.posixInts.`0`
    - typings.posix.posixInts.`1`
  */
  type PosixMask = _PosixMask | Boolean
  
  /* Rewritten from type alias, can be one of: 
    - typings.posix.posixStrings.emerg
    - typings.posix.posixStrings.alert
    - typings.posix.posixStrings.crit
    - typings.posix.posixStrings.err
    - typings.posix.posixStrings.warning
    - typings.posix.posixStrings.notice
    - typings.posix.posixStrings.info
    - typings.posix.posixStrings.debug
  */
  trait Priority extends StObject
  object Priority {
    
    inline def alert: typings.posix.posixStrings.alert = "alert".asInstanceOf[typings.posix.posixStrings.alert]
    
    inline def crit: typings.posix.posixStrings.crit = "crit".asInstanceOf[typings.posix.posixStrings.crit]
    
    inline def debug: typings.posix.posixStrings.debug = "debug".asInstanceOf[typings.posix.posixStrings.debug]
    
    inline def emerg: typings.posix.posixStrings.emerg = "emerg".asInstanceOf[typings.posix.posixStrings.emerg]
    
    inline def err: typings.posix.posixStrings.err = "err".asInstanceOf[typings.posix.posixStrings.err]
    
    inline def info: typings.posix.posixStrings.info = "info".asInstanceOf[typings.posix.posixStrings.info]
    
    inline def notice: typings.posix.posixStrings.notice = "notice".asInstanceOf[typings.posix.posixStrings.notice]
    
    inline def warning: typings.posix.posixStrings.warning = "warning".asInstanceOf[typings.posix.posixStrings.warning]
  }
  
  trait PriorityMask extends StObject {
    
    var alert: js.UndefOr[PosixMask] = js.undefined
    
    var crit: js.UndefOr[PosixMask] = js.undefined
    
    var debug: js.UndefOr[PosixMask] = js.undefined
    
    var emerg: js.UndefOr[PosixMask] = js.undefined
    
    var err: js.UndefOr[PosixMask] = js.undefined
    
    var info: js.UndefOr[PosixMask] = js.undefined
    
    var notice: js.UndefOr[PosixMask] = js.undefined
    
    var warning: js.UndefOr[PosixMask] = js.undefined
  }
  object PriorityMask {
    
    inline def apply(): PriorityMask = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PriorityMask]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PriorityMask] (val x: Self) extends AnyVal {
      
      inline def setAlert(value: PosixMask): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
      
      inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
      
      inline def setCrit(value: PosixMask): Self = StObject.set(x, "crit", value.asInstanceOf[js.Any])
      
      inline def setCritUndefined: Self = StObject.set(x, "crit", js.undefined)
      
      inline def setDebug(value: PosixMask): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setEmerg(value: PosixMask): Self = StObject.set(x, "emerg", value.asInstanceOf[js.Any])
      
      inline def setEmergUndefined: Self = StObject.set(x, "emerg", js.undefined)
      
      inline def setErr(value: PosixMask): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setErrUndefined: Self = StObject.set(x, "err", js.undefined)
      
      inline def setInfo(value: PosixMask): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setInfoUndefined: Self = StObject.set(x, "info", js.undefined)
      
      inline def setNotice(value: PosixMask): Self = StObject.set(x, "notice", value.asInstanceOf[js.Any])
      
      inline def setNoticeUndefined: Self = StObject.set(x, "notice", js.undefined)
      
      inline def setWarning(value: PosixMask): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
      
      inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.posix.posixStrings.core
    - typings.posix.posixStrings.cpu
    - typings.posix.posixStrings.data
    - typings.posix.posixStrings.fsize
    - typings.posix.posixStrings.nofile
    - typings.posix.posixStrings.nproc
    - typings.posix.posixStrings.stack
    - typings.posix.posixStrings.as
  */
  trait Resource extends StObject
  object Resource {
    
    inline def as: typings.posix.posixStrings.as = "as".asInstanceOf[typings.posix.posixStrings.as]
    
    inline def core: typings.posix.posixStrings.core = "core".asInstanceOf[typings.posix.posixStrings.core]
    
    inline def cpu: typings.posix.posixStrings.cpu = "cpu".asInstanceOf[typings.posix.posixStrings.cpu]
    
    inline def data: typings.posix.posixStrings.data = "data".asInstanceOf[typings.posix.posixStrings.data]
    
    inline def fsize: typings.posix.posixStrings.fsize = "fsize".asInstanceOf[typings.posix.posixStrings.fsize]
    
    inline def nofile: typings.posix.posixStrings.nofile = "nofile".asInstanceOf[typings.posix.posixStrings.nofile]
    
    inline def nproc: typings.posix.posixStrings.nproc = "nproc".asInstanceOf[typings.posix.posixStrings.nproc]
    
    inline def stack: typings.posix.posixStrings.stack = "stack".asInstanceOf[typings.posix.posixStrings.stack]
  }
  
  trait SwapFlags extends StObject {
    
    var discard: js.UndefOr[PosixMask] = js.undefined
    
    var prefer: js.UndefOr[PosixMask] = js.undefined
  }
  object SwapFlags {
    
    inline def apply(): SwapFlags = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwapFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwapFlags] (val x: Self) extends AnyVal {
      
      inline def setDiscard(value: PosixMask): Self = StObject.set(x, "discard", value.asInstanceOf[js.Any])
      
      inline def setDiscardUndefined: Self = StObject.set(x, "discard", js.undefined)
      
      inline def setPrefer(value: PosixMask): Self = StObject.set(x, "prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "prefer", js.undefined)
    }
  }
  
  trait _PosixMask extends StObject
}
