package typings.posix

import typings.posix.mod.Facility
import typings.posix.mod.Priority
import typings.posix.mod.Resource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object posixStrings {
  
  @js.native
  sealed trait alert
    extends StObject
       with Priority
  inline def alert: alert = "alert".asInstanceOf[alert]
  
  @js.native
  sealed trait as
    extends StObject
       with Resource
  inline def as: as = "as".asInstanceOf[as]
  
  @js.native
  sealed trait auth
    extends StObject
       with Facility
  inline def auth: auth = "auth".asInstanceOf[auth]
  
  @js.native
  sealed trait authpriv
    extends StObject
       with Facility
  inline def authpriv: authpriv = "authpriv".asInstanceOf[authpriv]
  
  @js.native
  sealed trait core
    extends StObject
       with Resource
  inline def core: core = "core".asInstanceOf[core]
  
  @js.native
  sealed trait cpu
    extends StObject
       with Resource
  inline def cpu: cpu = "cpu".asInstanceOf[cpu]
  
  @js.native
  sealed trait crit
    extends StObject
       with Priority
  inline def crit: crit = "crit".asInstanceOf[crit]
  
  @js.native
  sealed trait cron
    extends StObject
       with Facility
  inline def cron: cron = "cron".asInstanceOf[cron]
  
  @js.native
  sealed trait daemon
    extends StObject
       with Facility
  inline def daemon: daemon = "daemon".asInstanceOf[daemon]
  
  @js.native
  sealed trait data
    extends StObject
       with Resource
  inline def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait debug
    extends StObject
       with Priority
  inline def debug: debug = "debug".asInstanceOf[debug]
  
  @js.native
  sealed trait emerg
    extends StObject
       with Priority
  inline def emerg: emerg = "emerg".asInstanceOf[emerg]
  
  @js.native
  sealed trait err
    extends StObject
       with Priority
  inline def err: err = "err".asInstanceOf[err]
  
  @js.native
  sealed trait fsize
    extends StObject
       with Resource
  inline def fsize: fsize = "fsize".asInstanceOf[fsize]
  
  @js.native
  sealed trait ftp
    extends StObject
       with Facility
  inline def ftp: ftp = "ftp".asInstanceOf[ftp]
  
  @js.native
  sealed trait info
    extends StObject
       with Priority
  inline def info: info = "info".asInstanceOf[info]
  
  @js.native
  sealed trait kern
    extends StObject
       with Facility
  inline def kern: kern = "kern".asInstanceOf[kern]
  
  @js.native
  sealed trait local0
    extends StObject
       with Facility
  inline def local0: local0 = "local0".asInstanceOf[local0]
  
  @js.native
  sealed trait local1
    extends StObject
       with Facility
  inline def local1: local1 = "local1".asInstanceOf[local1]
  
  @js.native
  sealed trait local2
    extends StObject
       with Facility
  inline def local2: local2 = "local2".asInstanceOf[local2]
  
  @js.native
  sealed trait local3
    extends StObject
       with Facility
  inline def local3: local3 = "local3".asInstanceOf[local3]
  
  @js.native
  sealed trait local4
    extends StObject
       with Facility
  inline def local4: local4 = "local4".asInstanceOf[local4]
  
  @js.native
  sealed trait local5
    extends StObject
       with Facility
  inline def local5: local5 = "local5".asInstanceOf[local5]
  
  @js.native
  sealed trait local6
    extends StObject
       with Facility
  inline def local6: local6 = "local6".asInstanceOf[local6]
  
  @js.native
  sealed trait local7
    extends StObject
       with Facility
  inline def local7: local7 = "local7".asInstanceOf[local7]
  
  @js.native
  sealed trait lpr
    extends StObject
       with Facility
  inline def lpr: lpr = "lpr".asInstanceOf[lpr]
  
  @js.native
  sealed trait mail
    extends StObject
       with Facility
  inline def mail: mail = "mail".asInstanceOf[mail]
  
  @js.native
  sealed trait news
    extends StObject
       with Facility
  inline def news: news = "news".asInstanceOf[news]
  
  @js.native
  sealed trait nofile
    extends StObject
       with Resource
  inline def nofile: nofile = "nofile".asInstanceOf[nofile]
  
  @js.native
  sealed trait notice
    extends StObject
       with Priority
  inline def notice: notice = "notice".asInstanceOf[notice]
  
  @js.native
  sealed trait nproc
    extends StObject
       with Resource
  inline def nproc: nproc = "nproc".asInstanceOf[nproc]
  
  @js.native
  sealed trait stack
    extends StObject
       with Resource
  inline def stack: stack = "stack".asInstanceOf[stack]
  
  @js.native
  sealed trait syslog
    extends StObject
       with Facility
  inline def syslog: syslog = "syslog".asInstanceOf[syslog]
  
  @js.native
  sealed trait user
    extends StObject
       with Facility
  inline def user: user = "user".asInstanceOf[user]
  
  @js.native
  sealed trait uucp
    extends StObject
       with Facility
  inline def uucp: uucp = "uucp".asInstanceOf[uucp]
  
  @js.native
  sealed trait warning
    extends StObject
       with Priority
  inline def warning: warning = "warning".asInstanceOf[warning]
}
