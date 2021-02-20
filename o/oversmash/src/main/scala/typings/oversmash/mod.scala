package typings.oversmash

import org.scalablytyped.runtime.StringDictionary
import typings.oversmash.anon.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("oversmash", JSImport.Default)
  @js.native
  def default(): Options = js.native
  @JSImport("oversmash", JSImport.Default)
  @js.native
  def default(callerOptions: CallerOptions): Options = js.native
  
  @js.native
  sealed trait NormalizeNamesAs extends StObject
  @JSImport("oversmash", "NormalizeNamesAs")
  @js.native
  object NormalizeNamesAs extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[NormalizeNamesAs with String] = js.native
    
    @js.native
    sealed trait camel extends NormalizeNamesAs
    /* "camel" */ val camel: typings.oversmash.mod.NormalizeNamesAs.camel with String = js.native
    
    @js.native
    sealed trait snake extends NormalizeNamesAs
    /* "snake" */ val snake: typings.oversmash.mod.NormalizeNamesAs.snake with String = js.native
  }
  
  @js.native
  trait Account extends StObject {
    
    var displayName: js.UndefOr[String] = js.native
    
    var level: Double = js.native
    
    var platform: String = js.native
    
    var portrait: String = js.native
    
    var public: Boolean = js.native
  }
  object Account {
    
    @scala.inline
    def apply(level: Double, platform: String, portrait: String, public: Boolean): Account = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], portrait = portrait.asInstanceOf[js.Any], public = public.asInstanceOf[js.Any])
      __obj.asInstanceOf[Account]
    }
    
    @scala.inline
    implicit class AccountMutableBuilder[Self <: Account] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      @scala.inline
      def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortrait(value: String): Self = StObject.set(x, "portrait", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublic(value: Boolean): Self = StObject.set(x, "public", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Achievement extends StObject {
    
    var achieved: Boolean = js.native
    
    var name: String = js.native
  }
  object Achievement {
    
    @scala.inline
    def apply(achieved: Boolean, name: String): Achievement = {
      val __obj = js.Dynamic.literal(achieved = achieved.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Achievement]
    }
    
    @scala.inline
    implicit class AchievementMutableBuilder[Self <: Achievement] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAchieved(value: Boolean): Self = StObject.set(x, "achieved", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CallerOptions extends StObject {
    
    var defaultPlatform: String = js.native
    
    var normalizeNames: Boolean = js.native
    
    var normalizeNamesAs: NormalizeNamesAs = js.native
    
    var normalizeValues: Boolean = js.native
    
    var percentsToInts: Boolean = js.native
    
    var portraitUrlTemplate: String = js.native
    
    var requestOptions: RequestOptions = js.native
  }
  object CallerOptions {
    
    @scala.inline
    def apply(
      defaultPlatform: String,
      normalizeNames: Boolean,
      normalizeNamesAs: NormalizeNamesAs,
      normalizeValues: Boolean,
      percentsToInts: Boolean,
      portraitUrlTemplate: String,
      requestOptions: RequestOptions
    ): CallerOptions = {
      val __obj = js.Dynamic.literal(defaultPlatform = defaultPlatform.asInstanceOf[js.Any], normalizeNames = normalizeNames.asInstanceOf[js.Any], normalizeNamesAs = normalizeNamesAs.asInstanceOf[js.Any], normalizeValues = normalizeValues.asInstanceOf[js.Any], percentsToInts = percentsToInts.asInstanceOf[js.Any], portraitUrlTemplate = portraitUrlTemplate.asInstanceOf[js.Any], requestOptions = requestOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallerOptions]
    }
    
    @scala.inline
    implicit class CallerOptionsMutableBuilder[Self <: CallerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultPlatform(value: String): Self = StObject.set(x, "defaultPlatform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeNames(value: Boolean): Self = StObject.set(x, "normalizeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeNamesAs(value: NormalizeNamesAs): Self = StObject.set(x, "normalizeNamesAs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeValues(value: Boolean): Self = StObject.set(x, "normalizeValues", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercentsToInts(value: Boolean): Self = StObject.set(x, "percentsToInts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortraitUrlTemplate(value: String): Self = StObject.set(x, "portraitUrlTemplate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptions(value: RequestOptions): Self = StObject.set(x, "requestOptions", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CompetitiveRank extends StObject {
    
    var damage: js.UndefOr[Double] = js.native
    
    var support: js.UndefOr[Double] = js.native
    
    var tank: js.UndefOr[Double] = js.native
  }
  object CompetitiveRank {
    
    @scala.inline
    def apply(): CompetitiveRank = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompetitiveRank]
    }
    
    @scala.inline
    implicit class CompetitiveRankMutableBuilder[Self <: CompetitiveRank] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDamage(value: Double): Self = StObject.set(x, "damage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDamageUndefined: Self = StObject.set(x, "damage", js.undefined)
      
      @scala.inline
      def setSupport(value: Double): Self = StObject.set(x, "support", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportUndefined: Self = StObject.set(x, "support", js.undefined)
      
      @scala.inline
      def setTank(value: Double): Self = StObject.set(x, "tank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTankUndefined: Self = StObject.set(x, "tank", js.undefined)
    }
  }
  
  @js.native
  trait Game extends StObject {
    
    var gamesLost: Double = js.native
    
    var gamesPlayed: Double = js.native
    
    var gamesTied: Double = js.native
    
    var gamesWon: Double = js.native
    
    var games_lost: Double = js.native
    
    var games_played: Double = js.native
    
    var games_tied: Double = js.native
    
    var games_won: Double = js.native
    
    var timePlayed: String = js.native
    
    var time_played: String = js.native
  }
  object Game {
    
    @scala.inline
    def apply(
      gamesLost: Double,
      gamesPlayed: Double,
      gamesTied: Double,
      gamesWon: Double,
      games_lost: Double,
      games_played: Double,
      games_tied: Double,
      games_won: Double,
      timePlayed: String,
      time_played: String
    ): Game = {
      val __obj = js.Dynamic.literal(gamesLost = gamesLost.asInstanceOf[js.Any], gamesPlayed = gamesPlayed.asInstanceOf[js.Any], gamesTied = gamesTied.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_lost = games_lost.asInstanceOf[js.Any], games_played = games_played.asInstanceOf[js.Any], games_tied = games_tied.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], timePlayed = timePlayed.asInstanceOf[js.Any], time_played = time_played.asInstanceOf[js.Any])
      __obj.asInstanceOf[Game]
    }
    
    @scala.inline
    implicit class GameMutableBuilder[Self <: Game] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGamesLost(value: Double): Self = StObject.set(x, "gamesLost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamesPlayed(value: Double): Self = StObject.set(x, "gamesPlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamesTied(value: Double): Self = StObject.set(x, "gamesTied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamesWon(value: Double): Self = StObject.set(x, "gamesWon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_lost(value: Double): Self = StObject.set(x, "games_lost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_played(value: Double): Self = StObject.set(x, "games_played", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_tied(value: Double): Self = StObject.set(x, "games_tied", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_won(value: Double): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimePlayed(value: String): Self = StObject.set(x, "timePlayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime_played(value: String): Self = StObject.set(x, "time_played", value.asInstanceOf[js.Any])
    }
  }
  
  type GameMode = StringDictionary[Hero]
  
  type Header = StringDictionary[String]
  
  @js.native
  trait Hero extends StObject {
    
    var assists: js.UndefOr[Statistic] = js.native
    
    var average: js.UndefOr[Statistic] = js.native
    
    var awards: js.UndefOr[Statistic] = js.native
    
    var best: js.UndefOr[Statistic] = js.native
    
    var combat: js.UndefOr[Statistic] = js.native
    
    var game: js.UndefOr[Game] = js.native
    
    var hero: js.UndefOr[Statistic] = js.native
    
    var misc: js.UndefOr[Statistic] = js.native
    
    var name: String = js.native
    
    var rawName: String = js.native
    
    var raw_name: String = js.native
  }
  object Hero {
    
    @scala.inline
    def apply(name: String, rawName: String, raw_name: String): Hero = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], rawName = rawName.asInstanceOf[js.Any], raw_name = raw_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hero]
    }
    
    @scala.inline
    implicit class HeroMutableBuilder[Self <: Hero] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssists(value: Statistic): Self = StObject.set(x, "assists", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssistsUndefined: Self = StObject.set(x, "assists", js.undefined)
      
      @scala.inline
      def setAverage(value: Statistic): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
      
      @scala.inline
      def setAwards(value: Statistic): Self = StObject.set(x, "awards", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAwardsUndefined: Self = StObject.set(x, "awards", js.undefined)
      
      @scala.inline
      def setBest(value: Statistic): Self = StObject.set(x, "best", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBestUndefined: Self = StObject.set(x, "best", js.undefined)
      
      @scala.inline
      def setCombat(value: Statistic): Self = StObject.set(x, "combat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCombatUndefined: Self = StObject.set(x, "combat", js.undefined)
      
      @scala.inline
      def setGame(value: Game): Self = StObject.set(x, "game", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGameUndefined: Self = StObject.set(x, "game", js.undefined)
      
      @scala.inline
      def setHero(value: Statistic): Self = StObject.set(x, "hero", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeroUndefined: Self = StObject.set(x, "hero", js.undefined)
      
      @scala.inline
      def setMisc(value: Statistic): Self = StObject.set(x, "misc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiscUndefined: Self = StObject.set(x, "misc", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawName(value: String): Self = StObject.set(x, "rawName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw_name(value: String): Self = StObject.set(x, "raw_name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Player extends StObject {
    
    var accounts: js.Array[Account] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var nameEscaped: String = js.native
    
    var nameEscapedUrl: String = js.native
  }
  object Player {
    
    @scala.inline
    def apply(accounts: js.Array[Account], nameEscaped: String, nameEscapedUrl: String): Player = {
      val __obj = js.Dynamic.literal(accounts = accounts.asInstanceOf[js.Any], nameEscaped = nameEscaped.asInstanceOf[js.Any], nameEscapedUrl = nameEscapedUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Player]
    }
    
    @scala.inline
    implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccounts(value: js.Array[Account]): Self = StObject.set(x, "accounts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountsVarargs(value: Account*): Self = StObject.set(x, "accounts", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEscaped(value: String): Self = StObject.set(x, "nameEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEscapedUrl(value: String): Self = StObject.set(x, "nameEscapedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  @js.native
  trait PlayerStats extends StObject {
    
    var name: js.UndefOr[String] = js.native
    
    var nameEscaped: String = js.native
    
    var nameEscapedUrl: js.UndefOr[String] = js.native
    
    var platform: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var stats: Stats = js.native
  }
  object PlayerStats {
    
    @scala.inline
    def apply(nameEscaped: String, platform: String, stats: Stats): PlayerStats = {
      val __obj = js.Dynamic.literal(nameEscaped = nameEscaped.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[PlayerStats]
    }
    
    @scala.inline
    implicit class PlayerStatsMutableBuilder[Self <: PlayerStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEscaped(value: String): Self = StObject.set(x, "nameEscaped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEscapedUrl(value: String): Self = StObject.set(x, "nameEscapedUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameEscapedUrlUndefined: Self = StObject.set(x, "nameEscapedUrl", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestOptions extends StObject {
    
    var baseURL: String = js.native
    
    var headers: Header = js.native
  }
  object RequestOptions {
    
    @scala.inline
    def apply(baseURL: String, headers: Header): RequestOptions = {
      val __obj = js.Dynamic.literal(baseURL = baseURL.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit class RequestOptionsMutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: Header): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type Statistic = StringDictionary[String | Double | Null]
  
  @js.native
  trait Stats extends StObject {
    
    var achievements: js.Array[Achievement] = js.native
    
    var competitive: GameMode = js.native
    
    var competitiveRank: CompetitiveRank = js.native
    
    var competitive_rank: CompetitiveRank = js.native
    
    var endorsementLevel: Double = js.native
    
    var endorsement_level: Double = js.native
    
    var gamesWon: Double = js.native
    
    var games_won: Double = js.native
    
    var quickplay: GameMode = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(
      achievements: js.Array[Achievement],
      competitive: GameMode,
      competitiveRank: CompetitiveRank,
      competitive_rank: CompetitiveRank,
      endorsementLevel: Double,
      endorsement_level: Double,
      gamesWon: Double,
      games_won: Double,
      quickplay: GameMode
    ): Stats = {
      val __obj = js.Dynamic.literal(achievements = achievements.asInstanceOf[js.Any], competitive = competitive.asInstanceOf[js.Any], competitiveRank = competitiveRank.asInstanceOf[js.Any], competitive_rank = competitive_rank.asInstanceOf[js.Any], endorsementLevel = endorsementLevel.asInstanceOf[js.Any], endorsement_level = endorsement_level.asInstanceOf[js.Any], gamesWon = gamesWon.asInstanceOf[js.Any], games_won = games_won.asInstanceOf[js.Any], quickplay = quickplay.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAchievements(value: js.Array[Achievement]): Self = StObject.set(x, "achievements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAchievementsVarargs(value: Achievement*): Self = StObject.set(x, "achievements", js.Array(value :_*))
      
      @scala.inline
      def setCompetitive(value: GameMode): Self = StObject.set(x, "competitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompetitiveRank(value: CompetitiveRank): Self = StObject.set(x, "competitiveRank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompetitive_rank(value: CompetitiveRank): Self = StObject.set(x, "competitive_rank", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndorsementLevel(value: Double): Self = StObject.set(x, "endorsementLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndorsement_level(value: Double): Self = StObject.set(x, "endorsement_level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGamesWon(value: Double): Self = StObject.set(x, "gamesWon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGames_won(value: Double): Self = StObject.set(x, "games_won", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuickplay(value: GameMode): Self = StObject.set(x, "quickplay", value.asInstanceOf[js.Any])
    }
  }
}
