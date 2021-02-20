package typings.plugapi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object User {
  
  @js.native
  trait Audience extends DJ {
    
    var ignores: js.Array[_] = js.native
    
    var notifications: js.Array[Notification] = js.native
    
    var pp: Double = js.native
    
    var pw: Double = js.native
    
    var xp: Double = js.native
  }
  object Audience {
    
    @scala.inline
    def apply(
      avatarID: String,
      badge: String,
      blurp: js.Any,
      gRole: Double,
      grab: Boolean,
      id: Double,
      ignores: js.Array[_],
      joined: String,
      language: String,
      level: Double,
      notifications: js.Array[Notification],
      pp: Double,
      pw: Double,
      role: Double,
      slug: String,
      status: Double,
      sub: Double,
      username: String,
      vote: Double,
      xp: Double
    ): Audience = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ignores = ignores.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], notifications = notifications.asInstanceOf[js.Any], pp = pp.asInstanceOf[js.Any], pw = pw.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any], xp = xp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Audience]
    }
    
    @scala.inline
    implicit class AudienceMutableBuilder[Self <: Audience] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnores(value: js.Array[_]): Self = StObject.set(x, "ignores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoresVarargs(value: js.Any*): Self = StObject.set(x, "ignores", js.Array(value :_*))
      
      @scala.inline
      def setNotifications(value: js.Array[Notification]): Self = StObject.set(x, "notifications", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotificationsVarargs(value: Notification*): Self = StObject.set(x, "notifications", js.Array(value :_*))
      
      @scala.inline
      def setPp(value: Double): Self = StObject.set(x, "pp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPw(value: Double): Self = StObject.set(x, "pw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXp(value: Double): Self = StObject.set(x, "xp", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DJ extends Room {
    
    var blurp: js.Any = js.native
    
    var grab: Boolean = js.native
    
    var status: Double = js.native
    
    var vote: Double = js.native
  }
  object DJ {
    
    @scala.inline
    def apply(
      avatarID: String,
      badge: String,
      blurp: js.Any,
      gRole: Double,
      grab: Boolean,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      slug: String,
      status: Double,
      sub: Double,
      username: String,
      vote: Double
    ): DJ = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], blurp = blurp.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], grab = grab.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any], vote = vote.asInstanceOf[js.Any])
      __obj.asInstanceOf[DJ]
    }
    
    @scala.inline
    implicit class DJMutableBuilder[Self <: DJ] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBlurp(value: js.Any): Self = StObject.set(x, "blurp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGrab(value: Boolean): Self = StObject.set(x, "grab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVote(value: Double): Self = StObject.set(x, "vote", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Default extends StObject {
    
    var avatarID: String = js.native
    
    var language: String = js.native
    
    var username: String = js.native
  }
  object Default {
    
    @scala.inline
    def apply(avatarID: String, language: String, username: String): Default = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Default]
    }
    
    @scala.inline
    implicit class DefaultMutableBuilder[Self <: Default] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvatarID(value: String): Self = StObject.set(x, "avatarID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Extended extends Default {
    
    var curatorPoints: Double = js.native
    
    var djPoints: Double = js.native
    
    var fans: Double = js.native
    
    var id: String = js.native
    
    var listenerPoints: Double = js.native
    
    var status: Double = js.native
  }
  object Extended {
    
    @scala.inline
    def apply(
      avatarID: String,
      curatorPoints: Double,
      djPoints: Double,
      fans: Double,
      id: String,
      language: String,
      listenerPoints: Double,
      status: Double,
      username: String
    ): Extended = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extended]
    }
    
    @scala.inline
    implicit class ExtendedMutableBuilder[Self <: Extended] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCuratorPoints(value: Double): Self = StObject.set(x, "curatorPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDjPoints(value: Double): Self = StObject.set(x, "djPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFans(value: Double): Self = StObject.set(x, "fans", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenerPoints(value: Double): Self = StObject.set(x, "listenerPoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Room extends Default {
    
    var badge: String = js.native
    
    var gRole: Double = js.native
    
    var id: Double = js.native
    
    var joined: String = js.native
    
    var level: Double = js.native
    
    var role: Double = js.native
    
    var slug: String = js.native
    
    var sub: Double = js.native
  }
  object Room {
    
    @scala.inline
    def apply(
      avatarID: String,
      badge: String,
      gRole: Double,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      slug: String,
      sub: Double,
      username: String
    ): Room = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Room]
    }
    
    @scala.inline
    implicit class RoomMutableBuilder[Self <: Room] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBadge(value: String): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRole(value: Double): Self = StObject.set(x, "gRole", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJoined(value: String): Self = StObject.set(x, "joined", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRole(value: Double): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlug(value: String): Self = StObject.set(x, "slug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSub(value: Double): Self = StObject.set(x, "sub", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Update extends Extended {
    
    var dateJoined: String = js.native
  }
  object Update {
    
    @scala.inline
    def apply(
      avatarID: String,
      curatorPoints: Double,
      dateJoined: String,
      djPoints: Double,
      fans: Double,
      id: String,
      language: String,
      listenerPoints: Double,
      status: Double,
      username: String
    ): Update = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], curatorPoints = curatorPoints.asInstanceOf[js.Any], dateJoined = dateJoined.asInstanceOf[js.Any], djPoints = djPoints.asInstanceOf[js.Any], fans = fans.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listenerPoints = listenerPoints.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Update]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDateJoined(value: String): Self = StObject.set(x, "dateJoined", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait User extends Room {
    
    var guest: Boolean = js.native
    
    var silver: Boolean = js.native
  }
  object User {
    
    @scala.inline
    def apply(
      avatarID: String,
      badge: String,
      gRole: Double,
      guest: Boolean,
      id: Double,
      joined: String,
      language: String,
      level: Double,
      role: Double,
      silver: Boolean,
      slug: String,
      sub: Double,
      username: String
    ): typings.plugapi.mod.User.User = {
      val __obj = js.Dynamic.literal(avatarID = avatarID.asInstanceOf[js.Any], badge = badge.asInstanceOf[js.Any], gRole = gRole.asInstanceOf[js.Any], guest = guest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], joined = joined.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], silver = silver.asInstanceOf[js.Any], slug = slug.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.plugapi.mod.User.User]
    }
    
    @scala.inline
    implicit class UserMutableBuilder[Self <: typings.plugapi.mod.User.User] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuest(value: Boolean): Self = StObject.set(x, "guest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSilver(value: Boolean): Self = StObject.set(x, "silver", value.asInstanceOf[js.Any])
    }
  }
}
